package com.sn4.vtones.network;

import org.lwjgl.glfw.GLFW;
import com.mojang.blaze3d.platform.InputConstants;
import com.sn4.vtones.Vtones;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
@Mod.EventBusSubscriber(modid = Vtones.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class CycleHandler {
	
	public static final KeyMapping KEY_VTONE_MENU = new KeyMapping("Open menu", KeyConflictContext.IN_GAME,
	InputConstants.Type.KEYSYM,GLFW.GLFW_KEY_B,"Vtones");


	/*
	private static final int MENU_SIZE = 8;
    private static final double MENU_RADIUS = 64;
    private static final double ITEM_ANGLE = 360.0 / MENU_SIZE;

    private static boolean isMenuOpen = false;
    private static int selectedItemIndex = 0;

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onKeyPress(GuiEventListener. event) {
        if (event.getKeyCode() == MENU_KEY && !isMenuOpen) {
            Minecraft minecraft = Minecraft.getInstance();
            Screen currentScreen = minecraft.currentScreen;

            if (currentScreen instanceof InventoryScreen) {
                isMenuOpen = true;
                selectedItemIndex = 0;
                minecraft.mouseHelper.grabMouse();
                minecraft.displayGuiScreen(new CustomMenuScreen((InventoryScreen) currentScreen));
            }
        }
    }

    public static class CustomMenuScreen extends Screen {
        private final InventoryScreen parentScreen;
        private final double centerX;
        private final double centerY;

        public CustomMenuScreen(InventoryScreen parentScreen) {
            super(parentScreen.getTitle());
            this.parentScreen = parentScreen;
            this.centerX = this.width / 2.0;
            this.centerY = this.height / 2.0;
        }

        @Override
        public void render(int mouseX, int mouseY, float partialTicks) {
            this.renderBackground();
            this.drawCenteredString(this.font, this.title.getFormattedText(), (int) centerX, (int) centerY - 80, 16777215);

            Minecraft minecraft = Minecraft.getInstance();
            PlayerEntity player = minecraft.player;

            double deltaX = mouseX - centerX;
            double deltaY = mouseY - centerY;
            double angle = (MathHelper.atan2(deltaY, deltaX) * 180.0 / Math.PI + 90.0 + ITEM_ANGLE / 2.0) % 360.0;

            int selectedIndex = (int) (angle / ITEM_ANGLE);

            for (int i = 0; i < MENU_SIZE; i++) {
                ItemStack itemStack = parentScreen.getContainer().getSlot(i + 9).getStack();
                double itemAngle = i * ITEM_ANGLE;
                double itemX = centerX + Math.cos(Math.toRadians(itemAngle)) * MENU_RADIUS;
                double itemY = centerY + Math.sin(Math.toRadians(itemAngle)) * MENU_RADIUS;
                int itemColor = selectedIndex == i ? 0xFFFF0000 : 0xFFFFFFFF;

                minecraft.getItemRenderer().renderItemIntoGUI(itemStack, (int) itemX - 8, (int) itemY - 8);
                this.font.drawString(itemStack.getDisplayName().getFormattedText(), (int) itemX - 4, (int) itemY + 8, itemColor);


	*/
	
	/*
	@SubscribeEvent
    public static void disableScrolling(InputEvent.KeyInputEvent event) {
		if(event.getKey() == MY_KEY_BINDING) {
			disableHotbarScrolling = true;
		}
		
		 @SubscribeEvent
		    public static void onMouseInput(GuiScreenEvent.MouseInputEvent.Pre event) {
		        // Check if the current screen is the player's inventory screen
		        if (event.getGui() instanceof PlayerInventoryScreen) {
		            // Check if no other inventory screens are currently open
		            if (Minecraft.getInstance().player.containerMenu == Minecraft.getInstance().player.inventoryMenu) {
		                // Check if hotbar scrolling should be disabled
		                if (disableHotbarScrolling) {
		                    // Cancel the event to prevent hotbar scrolling
		                    if (event.getButton() == GLFW.GLFW_MOUSE_BUTTON_4 || event.getButton() == GLFW.GLFW_MOUSE_BUTTON_5) {
		                        event.setCanceled(true);
		                    }
		                }
		            }
		        }
		    }
		
        // Check if the current screen is the player's inventory screen
        if (event.getGui() instanceof PlayerInventoryScreen) {
            // Check if no other inventory screens are currently open
            if (Minecraft.getInstance().player.containerMenu == Minecraft.getInstance().player.inventoryMenu) {
                // Cancel the event to prevent scrolling
                event.setCanceled(true);
            }
        }
    }
	
    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        // Check if the "P" key is pressed
        if (InputEvent.MouseScrollEvent.isMiddleDown())) {
            disableHotbarScrolling = true;
        } else {
            disableHotbarScrolling = false;
        }
    }
	
	@SubscribeEvent
    public static void onMouseScroll(InputEvent.MouseScrollEvent event) {
        Player player = Minecraft.getInstance().player;
        ItemStack currentItem = player.getMainHandItem();
        boolean VtoneInHand = player.getMainHandItem().equals(BlockInit.AGON_BLOCK_0.get())
    
        if (VtoneInHand && event.isMiddleDown()) {
        	
        }
            // Get the current item slot index

            // Get the next slot index, accounting for mouse scroll direction
            int nextItemSlotIndex = (int) ((currentItemSlotIndex - event.getScrollDelta()) % 9);

            // If the next slot index is negative, wrap around to the end of the hotbar
            if (nextItemSlotIndex < 0) {
                nextItemSlotIndex += 9;
            }

            // Set the new held item
            player.inventory.currentItem = nextItemSlotIndex;
	    
	@SubscribeEvent
    public static void onKeyInput(InputEvent.KeyInputEvent event) {
        if (MY_KEY_BINDING.isDown()) {
            @SuppressWarnings("resource")
			Player player = Minecraft.getInstance().player;
            

            // Get the player's inventory
            Inventory inventory = player.getInventory();

            // Find the index of the item you want to replace
            int index = inventory.findSlotMatchingItem(new ItemStack(Items.DIRT));

            // Replace the item with a new item
            if(index != -1) {
            	inventory.setItem(index, new ItemStack(Items.DIAMOND));
            }
            
            
            
        }
    }
*/		
}
