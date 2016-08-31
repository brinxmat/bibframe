package ontology;

import org.apache.commons.io.IOUtils;
import org.apache.jena.graph.Node;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;


/**
 * Responsibility: test bibframe ontology class.
 */
public class BibframeTest {

    @Test
    public void test_exists() {
        assertEquals("http://id.loc.gov/ontologies/bibframe/", Bibframe.getURI());
    }

    @Test
    public void test_ontology_aligns_with_master() throws IOException, URISyntaxException, NoSuchFieldException, IllegalAccessException {
        Model model = ModelFactory.createDefaultModel();
        RDFDataMgr.read(model, getOntology(), Lang.TURTLE);
        ResIterator subjects = model.listSubjects();
        while (subjects.hasNext()) {
            
            Resource resource = subjects.nextResource();

            if (resource.getURI().equals(Bibframe.getURI())) {
                continue;
            }

            assertEquals(resource, Bibframe.class.getField(resource.getLocalName()).get(Bibframe.class));
        }

    }

    private InputStream getOntology() throws URISyntaxException, IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        return classLoader.getResourceAsStream("bibframe.ttl");
    }
}
