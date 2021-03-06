package common

/**
  * Created by vinaygangadhar on 5/8/16.
  */

import Chisel._
import Node._

object SB_Instructions {

  def SB_CFG             = Bits("b?????????????????000000000001011")
  def SB_DMA_ADDR        = Bits("b000000000000?????000000001111011")
  def SB_DMA_STRIDE      = Bits("b0000000??????????001000001111011")
  def SB_DMA_SCR         = Bits("b0000000??????????000000000101011")
  def SB_SCR_RD          = Bits("b?????????????????001?????0101011")
  def SB_DMA_RD          = Bits("b?????????????????010000000101011")
  def SB_SET_ITER        = Bits("b000000000000?????010000001111011")
  def SB_CONST           = Bits("b0000000??????????011?????0101011")
  def SB_RD              = Bits("b????????????00000000000001011011")
  def SB_WR_SCR          = Bits("b0000000??????????001?????1011011")
  def SB_WR_DMA          = Bits("b000000000000?????010000001011011")
  def SB_RECUR           = Bits("b?????????????????011000001011011")
  def SB_SHFT_MOV        = Bits("b????????????00000100000001011011")
}
