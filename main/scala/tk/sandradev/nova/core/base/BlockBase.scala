package tk.sandradev.nova.core.base

import java.util.Optional

import nova.core.block.Block
import nova.core.render.BlockTexture
import nova.core.util.Direction

class BlockBase(id: String, texture: BlockTexture) extends Block {
  override def getID = id
  override def getTexture(side: Direction) = Optional.of(texture)
}
