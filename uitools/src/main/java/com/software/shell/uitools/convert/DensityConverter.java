/*
 * Copyright 2015 Shell Software Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * File created: 2015-01-30 22:55:44
 */

package com.software.shell.uitools.convert;

import android.content.Context;
import android.util.Log;

/**
 * Contains utility methods for density values conversion based on current
 * device's display metrics
 *
 * @author shell
 * @version 1.0.0
 * @since 1.0.0
 */
public final class DensityConverter {

	/**
	 * Logging tag
	 */
	private static final String LOG_TAG = String.format("[UI Tools][%s]", DensityConverter.class.getSimpleName());

	/**
	 * Prevents from creating {@link DensityConverter} instances
	 */
	private DensityConverter() {
	}

	/**
	 * Converts the density-independent value into real pixel value based on current display metrics
	 *
	 * @param context application context
	 * @param dp density-independent value
	 * @return converted real pixel value
	 */
	public static float dpToPx(Context context, float dp) {
		float result = dp * calculateDensityScaleFactor(context);
		Log.v(LOG_TAG, String.format("Density-independent value [%s] converted to real pixel value [%s]", dp, result));
		return result;
	}

	/**
	 * Converts the real pixel value into density-independent value based on current display metrics
	 *
	 * @param context application context
	 * @param px real pixel value
	 * @return density-independent value
	 */
	public static float pxToDp(Context context, float px) {
		float result = px / calculateDensityScaleFactor(context);
		Log.v(LOG_TAG, String.format("Real pixel value [%s] converted to density-independent value [%s]", px, result));
		return result;
	}

	/**
	 * Calculates the density scale factor for the current device
	 * <p>
	 * Used when converting density-independent pixels to real ones and vice versa
	 *  
	 * @param context application context
	 * @return density scale factor for the current device
	 */
	private static float calculateDensityScaleFactor(Context context) {
		float densityScaleFactor = context.getResources().getDisplayMetrics().density;
		Log.v(LOG_TAG, "Density scale factor is: " + densityScaleFactor);
		return densityScaleFactor;
	}
	
}
