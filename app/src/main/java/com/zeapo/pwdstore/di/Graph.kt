/*
 * Copyright © 2014-2020 The Android Password Store Authors. All Rights Reserved.
 * SPDX-License-Identifier: GPL-3.0-only
 */

package com.zeapo.pwdstore.di

import com.zeapo.pwdstore.repo.FileStoreImpl
import com.zeapo.pwdstore.repo.FileXStoreImpl
import com.zeapo.pwdstore.repo.Store
import java.io.File

/**
 * Extremely rudimentary dependency injection container
 */
object Graph {

    lateinit var store: Store

    fun buildStoreImpl(baseDir: File, external: Boolean) {
        store = if (external)
            FileXStoreImpl(baseDir)
        else
            FileStoreImpl(baseDir)
    }
}
