package dev.mackery.arrowsincluded.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import com.llamalad7.mixinextras.sugar.Local;

import dev.mackery.arrowsincluded.ArrowScroll;
import net.minecraft.client.gui.screens.Screen;

/**
 * Create's toolbox menu only accepts scrolling while the cursor is near its center, but measures
 * that distance using the cursor's Y position for both axes, so on a non-square window scrolling
 * never works. Fix the distance, and always accept scrolls coming from the arrow keys.
 */
@Mixin(targets = "com.simibubi.create.content.equipment.toolbox.RadialToolboxMenu")
public abstract class RadialToolboxMenuMixin {

	@ModifyVariable(method = "mouseScrolled", at = @At("STORE"), name = "distance")
	private double arrowsincluded$fixCenterDistance(double distance,
		@Local(argsOnly = true, ordinal = 0) double mouseX, @Local(argsOnly = true, ordinal = 1) double mouseY) {
		if (ArrowScroll.isSynthetic())
			return 0;
		Screen self = (Screen) (Object) this;
		double dx = mouseX - self.width / 2;
		double dy = mouseY - self.height / 2;
		return dx * dx + dy * dy;
	}
}
