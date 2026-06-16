/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.notman.nma.init;

import net.notman.nma.client.model.ModelSpiderQueen;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class NmaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSpiderQueen.LAYER_LOCATION, ModelSpiderQueen::createBodyLayer);
	}
}