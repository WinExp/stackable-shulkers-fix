package dev.kikugie.shulkerfix.carpet;

import carpet.api.settings.Rule;
import carpet.api.settings.RuleCategory;

public class ShulkerFixSettings {
	public static final String SHULKERFIX = "shulkerfix";

	@Rule(categories = {SHULKERFIX, RuleCategory.BUGFIX})
	public static boolean hopperShulkerStacking = true;

	@Rule(categories = {SHULKERFIX, RuleCategory.BUGFIX})
	public static boolean overstackedShulkerSignalStrength = false;

	@Rule(categories = {SHULKERFIX, RuleCategory.BUGFIX, RuleCategory.EXPERIMENTAL})
	public static boolean clientShulkerSync = false;

	@Rule(categories = {SHULKERFIX, RuleCategory.FEATURE, RuleCategory.EXPERIMENTAL})
	public static boolean hopperCollectSingleShulkers = false;

	@Rule(categories = {SHULKERFIX, RuleCategory.FEATURE, RuleCategory.EXPERIMENTAL})
	public static boolean minecartCollectSingleShulkers = false;

	@Rule(categories = {SHULKERFIX, RuleCategory.FEATURE, RuleCategory.EXPERIMENTAL})
	public static boolean overstackedMinecartSlowdown = true;
}
