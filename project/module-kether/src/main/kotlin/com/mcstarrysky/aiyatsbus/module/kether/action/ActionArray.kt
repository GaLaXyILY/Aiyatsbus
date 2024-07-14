package com.mcstarrysky.aiyatsbus.module.kether.action

import taboolib.module.kether.KetherParser
import taboolib.module.kether.combinationParser

/**
 * Aiyatsbus
 * com.mcstarrysky.aiyatsbus.module.kether.action.ActionArray
 *
 * @author mical
 * @since 2024/7/14 12:40
 */
object ActionArray {

    /**
     * 清空列表中的所有元素
     * arr-remove-last &array
     */
    @KetherParser(["arr-clear"], shared = true)
    fun actionArrayRemoveLast() = combinationParser {
        it.group(anyAsList()).apply(it) { array -> now { array.clear() } }
    }
}