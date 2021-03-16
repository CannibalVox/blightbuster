package talonos.cavestokingdoms.network.handlers;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.client.Minecraft;
import talonos.cavestokingdoms.CavesToKindgoms;
import talonos.cavestokingdoms.client.pages.orediscovery.OreDiscoveryRegistry;
import talonos.cavestokingdoms.network.packets.AddDiscoveryPacket;

public class AddDiscoveryHandler implements IMessageHandler<AddDiscoveryPacket, IMessage> {

    public AddDiscoveryHandler() {}

    @Override
    public IMessage onMessage(AddDiscoveryPacket message, MessageContext ctx) {
        OreDiscoveryRegistry.getInstance().addDiscovery(CavesToKindgoms.proxy.getPlayerFromContext(ctx), message.getDiscoveryName());

        return null;
    }
}
