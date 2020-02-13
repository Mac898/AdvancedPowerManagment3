package net.mcreator.advpowermanager3;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementsadvpowermanager3.ModElement.Tag
public class MCreatorAdvancedPowerManagment extends Elementsadvpowermanager3.ModElement {
	public MCreatorAdvancedPowerManagment(Elementsadvpowermanager3 instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabadvancedpowermanagment") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(MCreatorLVChargingBench.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
