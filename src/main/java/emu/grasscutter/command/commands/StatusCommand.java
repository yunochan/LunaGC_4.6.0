package emu.grasscutter.command.commands;

import static emu.grasscutter.config.Configuration.ACCOUNT;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.GameConstants;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import java.util.List;
@Command(label = "status", aliases = { "st" }, permission = "admin.status", targetRequirement = Command.TargetRequirement.NONE)

public final class StatusCommand implements CommandHandler
{
    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
		int playerCount = Grasscutter.getGameServer().getPlayers().size();
        int maxPlayer = ACCOUNT.maxPlayer;
        String version = GameConstants.VERSION;
		double heapMemoryUsedPercentage = (Grasscutter.getMemoryUsage() / Grasscutter.getMaxHeapMemory()) * 100;
		String runTime = Grasscutter.getRunTime();
        CommandHandler.sendMessage(sender, String.format("当前服务状态\n服务端版本: %s\n玩家在线数量: %d/%d\n内存使用率: %.2f%%\n运行时间: %s", version, playerCount, maxPlayer, heapMemoryUsedPercentage, runTime));
    }
}
