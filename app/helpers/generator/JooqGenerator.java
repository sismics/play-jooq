package helpers.generator;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.*;
import play.Play;

/**
 * @author jtremeaux
 */
public class JooqGenerator {
    public void generate() throws Exception {
        Configuration configuration = new Configuration()
                .withJdbc(new Jdbc()
                        .withDriver(Play.configuration.getProperty("db.driver"))
                        .withUrl(Play.configuration.getProperty("db.url"))
                        .withUser(Play.configuration.getProperty("db.user"))
                        .withPassword(Play.configuration.getProperty("db.pass")))
                .withGenerator(new Generator()
                        .withDatabase(new Database()
                                .withName("org.jooq.util.h2.H2Database") // FIXME introspect db type
                                .withIncludes(".*")
                                .withExcludes("")
                                .withInputSchema("public"))
                        .withTarget(new Target()
                                .withPackageName("models.jooq")
                                .withDirectory("app")));

        GenerationTool.generate(configuration);
    }
}
