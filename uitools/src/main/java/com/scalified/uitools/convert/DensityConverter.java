/*
 * Copyright 2016 Scalified <http://www.scalified.com>
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
 */

package com.scalified.uitools.convert;

import android.content.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	 * Logger
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(DensityConverter.class);

	/**
	 * Forbids creation of the {@link DensityConverter} instances
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
		LOGGER.trace("Density-independent value: {} converted to real pixel value: {}", dp, result);
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
		LOGGER.trace("Real pixel value: {} converted to density-independent value: {}", px, result);
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
		LOGGER.trace("Density scale factor is: {}", densityScaleFactor);
		return densityScaleFactor;
	}
	
}
