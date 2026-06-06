/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aerosmp.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.aerosmp.client.model.ModelSpiderQueen;

@EventBusSubscriber(Dist.CLIENT)
public class AerosmpModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSpiderQueen.LAYER_LOCATION, ModelSpiderQueen::createBodyLayer);
	}
}