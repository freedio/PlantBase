package com.coradec.apps.plantbase.main

import com.coradec.coradeck.com.ctrl.impl.Logger
import com.coradec.coradeck.com.module.CoraComImpl
import com.coradec.coradeck.conf.model.LocalProperty
import com.coradec.coradeck.conf.module.CoraConfImpl
import com.coradec.coradeck.ctrl.module.CoraControlImpl
import com.coradec.coradeck.dir.model.module.CoraModules
import com.coradec.coradeck.text.module.CoraTextImpl
import com.coradec.coradeck.type.module.impl.CoraTypeImpl
import java.nio.file.Path

fun main() {
    CoraModules.register(CoraConfImpl(), CoraComImpl(), CoraTextImpl(), CoraTypeImpl(), CoraControlImpl())
    PlantBase.start()
}

object PlantBase : Logger() {
    val localRoot = LocalProperty<Path>("LocalRoot").value
    val inputBase = "$localRoot/inputs"
    val plantBase = "$inputBase/tea".also { debug("Plant Base: ‹$it›") }
    val modules = LocalProperty<Map<String, String>>("Modules").value.also { debug("Plant Modules: $it") }

    fun start() {

    }

}