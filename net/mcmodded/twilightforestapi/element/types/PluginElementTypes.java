//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcmodded.twilightforestapi.element.types;

import net.mcreator.element.BaseType;
import net.mcreator.element.ModElementType;
import net.mcreator.element.ModElementTypeLoader;
import net.mcmodded.twilightforestapi.ui.modgui.TwilightForestEntityGUI;

public class PluginElementTypes {
    public static ModElementType<?> TWILIGHTFORESTENTITY;

    public PluginElementTypes() {
    }

    public static void load() {
        TWILIGHTFORESTENTITY = ModElementTypeLoader.register(new ModElementType("twilightforestentity", 'B', BaseType.ENTITY, TwilightForestEntityGUI::new, TwilightForestEntity.class));
    }
}
