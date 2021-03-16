package talonos.cavestokingdoms.network.handlers;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.client.Minecraft;
import talonos.cavestokingdoms.CavesToKindgoms;
import talonos.cavestokingdoms.client.pages.orediscovery.OreDiscoveryRegistry;
import talonos.cavestokingdoms.network.packets.WipeDiscoveryProgressPacket;

public class WipeDiscoveryProgressHandler implements IMessageHandler<WipeDiscoveryProgressPacket, IMessage> {

    public WipeDiscoveryProgressHandler() {}

    @Override
    public IMessage onMessage(WipeDiscoveryProgressPacket message, MessageContext ctx) {
        OreDiscoveryRegistry.getInstance().clearDiscoveries(CavesToKindgoms.proxy.getPlayerFromContext(ctx).getEntityData());

        return null;
    }
}
