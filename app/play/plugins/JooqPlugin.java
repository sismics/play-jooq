package play.plugins;

import play.PlayPlugin;

public class JooqPlugin extends PlayPlugin {
    static {
        System.setProperty("org.jooq.no-logo", Boolean.TRUE.toString());
    }
}
