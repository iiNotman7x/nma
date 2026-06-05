/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aerosmp.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.aerosmp.client.renderer.SpiderQueenRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class AerosmpModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AerosmpModEntities.SPIDER_QUEEN.get(), SpiderQueenRenderer::new);
	}
}