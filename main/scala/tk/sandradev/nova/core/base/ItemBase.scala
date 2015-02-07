package tk.sandradev.nova.core.base

import java.util.Optional

import nova.core.item.Item
import nova.core.render.ItemTexture


class ItemBase(id: String, texture: ItemTexture) extends Item {
  override def getID = id
  override def getTexture = Optional.of(texture)
}
