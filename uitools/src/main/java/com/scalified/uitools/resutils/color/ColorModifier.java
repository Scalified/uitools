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

package com.scalified.uitools.resutils.color;

import android.graphics.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Contains utility methods for color modification
 *
 * @author shell
 * @version 1.0.0
 * @since 1.0.0
 */
public class ColorModifier {

	/**
	 * Logger
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(ColorModifier.class);

	/**
	 * Forbids creation of the {@link ColorModifier} instances
	 */
	private ColorModifier() {
	}

	/**
	 * Modifies the color exposure using the special factor.
	 * Depending on factor the result color become lighter or darker
	 * <p>
	 * Factor is a float value greater than 0.
	 * If factor is between 0.0 and 1.0 the result color will be darker
	 * (the lesser factor is the darker result color will be).
	 * If factor is greater than 1.0 the result color will be lighter
	 * (the more factor is the lighter result color will be).
	 * <p>
	 * If factor lesser than 0 is passed, no modifications will be done
	 *
	 * @param color input color to modify exposure of
	 * @param factor factor, which determines the rate of exposure modification
	 *
	 * @return result output color with modified exposure
	 */
	public static int modifyExposure(int color, float factor) {
		float mFactor = factor >= 0 ? factor : 1.0f;
		LOGGER.trace("Changing color exposure with factor: {}", mFactor);
		float hsv[] = new float[3];
		Color.colorToHSV(color, hsv);
		hsv[2] *= mFactor;
		return Color.HSVToColor(hsv);
	}

}
