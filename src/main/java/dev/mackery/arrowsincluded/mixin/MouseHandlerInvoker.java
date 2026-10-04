package dev.mackery.arrowsincluded.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.client.MouseHandler;

@Mixin(MouseHandler.class)
public interface MouseHandlerInvoker {

	@Invoker("onScroll")
	void arrowsincluded$onScroll(long windowPointer, double xOffset, double yOffset);
}
