//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcmodded.twilightforestapi;

import net.mcreator.plugin.JavaPlugin;
import net.mcreator.plugin.Plugin;
import net.mcreator.plugin.events.PreGeneratorsLoadingEvent;
import net.mcmodded.twilightforestapi.element.types.PluginElementTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Launcher extends JavaPlugin {
    private static final Logger LOG = LogManager.getLogger("TwilightForestApi Plugin");

    public Launcher(Plugin plugin) {
        super(plugin);
        this.addListener(PreGeneratorsLoadingEvent.class, (e) -> {
            PluginElementTypes.load();
        });
        LOG.info("Plugin was loaded");
    }
}
