/*
 * vMessage
 * Copyright (c) 2026.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * See the LICENSE file in the project root for details.
 */

package off.szymon.vmessage.compatibility;

import com.velocitypowered.api.proxy.Player;
import it.frafol.cleanstaffchat.velocity.objects.PlayerCache;
import java.util.UUID;

public class CleanStaffChatCompatibilityProvider {

    public CleanStaffChatCompatibilityProvider() {
        // Testing the getToggled functions to make sure CleanStaffChat actually is loaded.
        var ignored = PlayerCache.getToggled_2();
        var ignored2 = PlayerCache.getToggled_2_donor();
        var ignored3 = PlayerCache.getToggled_2_admin();
    }

    public boolean isToggled(Player player) {
        UUID uuid = player.getUniqueId();
        return PlayerCache.getToggled_2().contains(uuid) || PlayerCache.getToggled_2_donor().contains(uuid) || PlayerCache.getToggled_2_admin().contains(uuid);
    }
}
