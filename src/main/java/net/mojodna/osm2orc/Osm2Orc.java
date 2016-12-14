package net.mojodna.osm2orc;

import net.mojodna.osm2orc.standalone.OsmChangesetXml2Orc;
import net.mojodna.osm2orc.standalone.OsmPbf2Orc;

public class Osm2Orc {
    public static void main(String[] args) throws Exception {
        if (args[0].equals("--changeset")) {
            (new OsmChangesetXml2Orc(args[1], args[2])).convert();
            return;
        }
        OsmPbf2Orc.convert(args[0], args[1]);
    }
}
