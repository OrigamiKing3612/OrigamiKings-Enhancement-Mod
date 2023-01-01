package net.origamiking.mcmods.oem.sounds.soundevents;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSoundEvents {
    public static final SoundEvent ENTITY_NEW_COW_AMBIENT = register("cow_sound_new");


    private static SoundEvent register(String id) {
        return register(String.valueOf(new Identifier(id)));
    }
}
