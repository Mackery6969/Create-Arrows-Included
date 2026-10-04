package dev.mackery.arrowsincluded.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import dev.mackery.arrowsincluded.ArrowScroll;
import net.minecraft.client.KeyboardHandler;

/**
 * Catches arrow keys at the very start of key handling, before vanilla or other mods
 * (which may claim the arrow keys for themselves) get to see them.
 */
@Mixin(value = KeyboardHandler.class, priority = 500)
public abstract class KeyboardHandlerMixin {

	@Inject(method = "keyPress", at = @At("HEAD"), cancellable = true)
	private void arrowsincluded$onKeyPress(long windowPointer, int key, int scanCode, int action, int modifiers, CallbackInfo ci) {
		if (ArrowScroll.onKey(windowPointer, key, action, modifiers))
			ci.cancel();
	}
}
