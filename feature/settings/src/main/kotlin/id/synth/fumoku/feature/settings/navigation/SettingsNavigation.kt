/*
 * Copyright 2023 Synth.ID
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package id.synth.fumoku.feature.settings.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import id.synth.fumoku.feature.settings.SettingsScreen

const val ROUTE_SETTINGS = "fumoku/settings"

fun NavController.navigateToSettings(navOptions: NavOptions? = null) {
    this.navigate(
        ROUTE_SETTINGS,
        navOptions,
    )
}

fun NavGraphBuilder.settingsScreen() {
    composable(ROUTE_SETTINGS) {
        SettingsScreen(ROUTE_SETTINGS)
    }
}
