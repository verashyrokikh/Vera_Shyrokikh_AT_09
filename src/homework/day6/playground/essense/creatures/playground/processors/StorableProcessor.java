package homework.day6.playground.essense.creatures.playground.processors;

import homework.day6.playground.essense.creatures.playground.essense.craft.hand.Storable;
import homework.day6.playground.essense.creatures.playground.essense.material.Pourable;
import homework.day6.playground.essense.creatures.playground.utils.VolumeGenerator;


public class StorableProcessor {
    public void runStorable(Storable storable, Pourable pourable) {
        storable.store(pourable, VolumeGenerator.generateVolume(pourable));
    }

    public void runStorable(Storable storable, Pourable pourable, int volume) {
        storable.store(pourable, volume);
    }
}
