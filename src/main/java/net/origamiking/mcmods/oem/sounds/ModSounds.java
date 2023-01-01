package net.origamiking.mcmods.oem.sounds;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final Identifier COW_SOUND_NEW_ID = new Identifier("oem:cow_sound_new");
    public static SoundEvent COW_SOUND_NEW_EVENT = SoundEvent.of(COW_SOUND_NEW_ID);


    public static void register() {
        Registry.register(Registries.SOUND_EVENT, ModSounds.COW_SOUND_NEW_ID, COW_SOUND_NEW_EVENT);
    }
}
