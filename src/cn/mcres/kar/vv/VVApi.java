package cn.mcres.kar.vv;

import lk.vexview.api.VexViewAPI;
import lk.vexview.chat.VexChatChannel;
import lk.vexview.effects.VexEffect;
import lk.vexview.gui.OpenedVexGui;
import lk.vexview.gui.VexGui;
import lk.vexview.hud.MinecraftHud;
import lk.vexview.hud.VexShow;
import lk.vexview.newinv.VexPage;
import lk.vexview.potions.VexPotion;
import lk.vexview.scoreboard.VexScoreBoard;
import lk.vexview.tag.components.VexTag;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class VVApi {
    private VVApi() {
    }

    private static final VVApi api = new VVApi();

    public static VVApi getInstance() {
        return api;
    }

    @Deprecated
    public VVApi removePlayerTab(Player player, int id) {
        VexViewAPI.removePlayerTag(player, id);
        return this;
    }

    public VVApi addChatChannel(VexChatChannel channel) {
        VexViewAPI.addChatChannel(channel);
        return this;
    }

    @Deprecated
    public VVApi removePlayerTab(Player p, Object tag) {
        VexViewAPI.removePlayerTag(p, tag);
        return this;
    }

    @Deprecated
    public VVApi removeWorldTab(World world, int tag) {
        VexViewAPI.removeWorldTag(world, tag);
        return this;
    }

    public VVApi addWorldTag(World world, VexTag tag) {
        VexViewAPI.addWorldTag(world, tag);
        return this;
    }

    public VVApi setWorldScoreBoard(String world, String board) {
        VexViewAPI.setWorldScoreBoard(world, board);
        return this;
    }

    @Deprecated
    public VVApi sendFlowView(Player player, String text, int y, boolean b) {
        VexViewAPI.sendFlowView(player, text, y);
        return this;
    }

    @Deprecated
    public VVApi sendFlowView(Player player, String text, int y) {
        VexViewAPI.sendFlowView(player, text, y);
        return this;
    }

    public VexPotion getPlayerVexPotion(Player player, String pname) {
        return VexViewAPI.getPlayerVexPotion(player, pname);
    }

    public VVApi removeHUD(Player p, Object id) {
        VexViewAPI.removeHUD(p, id);
        return this;
    }

    public VVApi addPlayerVexPotion(Player player, VexPotion vp) {
        VexViewAPI.addPlayerVexPotion(player, vp);
        return this;
    }

    public VVApi removeWorldTag(World world, String tag) {
        VexViewAPI.removeWorldTag(world, tag);
        return this;
    }

    public VVApi registerScoreBoardGroup(VexScoreBoard a) {
        VexViewAPI.registerScoreBoardGroup(a);
        return this;
    }

    public VVApi addSideBarPage(VexPage page) {
        VexViewAPI.addSideBarPage(page);
        return this;
    }

    public VVApi sendHUD(Player player, VexShow vs, double x, double y) {
        VexViewAPI.sendHUD(player, vs, x, y);
        return this;
    }

    public VVApi sendHUD(Player player, VexShow vs) {
        VexViewAPI.sendHUD(player, vs);
        return this;
    }

    public VVApi spawnVexEffect(Location loc, VexEffect ve) {
        VexViewAPI.spawnVexEffect(loc, ve);
        return this;
    }

    @Deprecated
    public VVApi removeHUD(Player p, int id) {
        VexViewAPI.removeHUD(p, id);
        return this;
    }

    public VVApi openGui(Player player, String gui) {
        VexViewAPI.openGui(player, gui);
        return this;
    }

    public VVApi openGui(Player player, VexGui gui) {
        VexViewAPI.openGui(player, gui);
        return this;
    }

    public VVApi setMinecraftHudVisible(Player p, MinecraftHud mh, boolean visible) {
        VexViewAPI.setMinecraftHudVisible(mh, visible, p);
        return this;
    }

    public VVApi removePlayerTag(Player p, String tag) {
        VexViewAPI.removePlayerTag(p, tag);
        return this;
    }

    public VVApi addPlayerTag(Player p, VexTag tag) {
        VexViewAPI.addPlayerTag(p, tag);
        return this;
    }

    @Deprecated
    public VVApi removeWorldTag(World world, Object id) {
        VexViewAPI.removeWorldTag(world, id);
        return this;
    }

    public VVApi setDefaultScoreBoard(String world) {
        VexViewAPI.setDefaultScoreBoard(world);
        return this;
    }

    public OpenedVexGui getPlayerCurrentGui(Player p) {
        return VexViewAPI.getPlayerCurrentGui(p);
    }
}
