package net.mcreator.advpowermanager3;

import net.minecraft.item.ItemStack;
import ic2.api.item.ElectricItem;

@Elementsadvpowermanager3.ModElement.Tag
public class MCreatorChargingBenchChargingSlot extends Elementsadvpowermanager3.ModElement {
	public MCreatorChargingBenchChargingSlot(Elementsadvpowermanager3 instance) {
		super(instance, 12);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		ElectricItem.manager.charge(itemstack, 1.0D, 1, false, false);
	}
}
