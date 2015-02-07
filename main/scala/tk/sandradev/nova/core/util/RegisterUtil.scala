package tk.sandradev.nova.core.util

import java.util.function.Supplier

import nova.core.block.Block
import nova.core.item.Item
import nova.core.render.{BlockTexture, ItemTexture}
import tk.sandradev.nova.core.base.{BlockBase, ItemBase, SandraModBase}


object RegisterUtil {
  class ItemBaseSupplier(id: String, texture: ItemTexture) extends Supplier[Item] {
    def get = new ItemBase(id, texture)
  }
  class BlockBaseSupplier(id: String, texture: BlockTexture) extends Supplier[Block] {
    def get = new BlockBase(id, texture)
  }
  def registerItem(mod: SandraModBase, id: String) = {
    val texture = mod.renders.registerTexture(new ItemTexture(mod.textureDomain+":"+id))
    mod.items.registerItem(new ItemBaseSupplier(id, texture))
  }
  def registerBlock(mod: SandraModBase, id: String) = {
    val texture = mod.renders.registerTexture(new BlockTexture(mod.textureDomain+":"+id))
    mod.blocks.registerBlock(new BlockBaseSupplier(id, texture))
  }
}
