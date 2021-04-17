/*
 * Copyright (C) 2018 Velocity Contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.velocitypowered.proxy.network.packet.serverbound;

import com.velocitypowered.api.network.ProtocolVersion;
import com.velocitypowered.proxy.network.packet.Packet;
import com.velocitypowered.proxy.network.packet.PacketHandler;
import com.velocitypowered.proxy.network.packet.PacketReader;
import com.velocitypowered.proxy.network.packet.PacketWriter;
import io.netty.buffer.ByteBuf;

public class ServerboundStatusRequestPacket implements Packet {
  public static final ServerboundStatusRequestPacket INSTANCE = new ServerboundStatusRequestPacket();
  public static final PacketReader<ServerboundStatusRequestPacket> DECODER = PacketReader.instance(INSTANCE);
  public static final PacketWriter<ServerboundStatusRequestPacket> ENCODER = PacketWriter.noop();

  private ServerboundStatusRequestPacket() {
  }

  @Override
  public boolean handle(PacketHandler handler) {
    return handler.handle(this);
  }

  @Override
  public String toString() {
    return "StatusRequestPacket";
  }
}