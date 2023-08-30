package com.iliad.smokeshulkersexpanded.utils.interfaces;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;

public interface Milkable {
    public long nextPossibleMilkTime = 0;

    InteractionResult mobInteract(Player player, InteractionHand hand);

    int getMilkCooldown();
}