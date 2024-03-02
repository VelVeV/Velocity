/*
 * Copyright (C) 2024 Velocity Contributors
 *
 * The Velocity API is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package com.velocitypowered.api.event.player.configuration;

import com.velocitypowered.api.proxy.Player;
import org.jetbrains.annotations.NotNull;

// TODO: Protocol State API
/**
 * This event is executed when a player with version 1.20.2 or higher enters the configuration phase.
 * <p>From this moment on, until the {@link PlayerFinishedConfigurationEvent} is executed,
 * the {@linkplain Player#protocolState()} method is guaranteed
 * to return {@link ProtocolState#CONFIGURATION}.</p>
 *
 * @param player The player that has entered the configuration phase
 * @since 3.3.0
 */
public record PlayerEnterConfigurationEvent(@NotNull Player player) {
}