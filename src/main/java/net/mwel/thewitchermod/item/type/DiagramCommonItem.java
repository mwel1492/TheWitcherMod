package net.mwel.thewitchermod.item.type;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DiagramCommonItem extends Item {
    public DiagramCommonItem(Settings settings){super(settings);}
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(Text.translatable("tooltip.thewitchermod.diagramcommonitem").formatted(Formatting.GRAY));
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
            ItemStack itemStack = user.getStackInHand(hand);
            if (isDiagram()) {
                if(!world.isClient){
                    Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity) user, itemStack);
                }
                user.playSound(SoundEvents.ITEM_BOOK_PAGE_TURN, .25f, 1f);
                user.setCurrentHand(hand);
                itemStack.decrement(1);
                return TypedActionResult.success(itemStack);
            }
        return TypedActionResult.pass(itemStack);
    }

    private boolean isDiagram() {
        return true;
    }
}

