/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.networkstack.apishim.api29;

import android.net.LinkProperties;
import android.net.NetworkCapabilities;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.android.networkstack.apishim.NetworkInformationShim;

/**
 * Compatibility implementation of {@link NetworkInformationShim}.
 *
 * <p>Use {@link com.android.networkstack.apishim.NetworkInformationShimImpl} instead of this
 * fallback implementation.
 */
public class NetworkInformationShimImpl implements NetworkInformationShim {
    protected NetworkInformationShimImpl() {}

    /**
     * Get a new instance of {@link NetworkInformationShim}.
     *
     * <p>Use com.android.networkstack.apishim.LinkPropertiesShimImpl#newInstance()
     * (non-API29 version) instead, to use the correct shims depending on build SDK.
     */
    public static NetworkInformationShim newInstance() {
        return new NetworkInformationShimImpl();
    }

    @Nullable
    @Override
    public Uri getCaptivePortalApiUrl(@Nullable LinkProperties lp) {
        // Not supported on this API level
        return null;
    }

    @Override
    public void setCaptivePortalApiUrl(@NonNull LinkProperties lp, @Nullable Uri url) {
        // Not supported on this API level: no-op
    }

    @Nullable
    @Override
    public String getSSID(@Nullable NetworkCapabilities nc) {
        // Not supported on this API level
        return null;
    }
}