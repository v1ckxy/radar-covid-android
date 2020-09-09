/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.features.helpline.protocols

interface HelplineView {

    fun showDialerForSupport()

    fun sendMailToInterview()

}

interface HelplinePresenter {

    fun viewReady()
    
    fun onContactSupportButtonClick()

    fun onInterViewEmailButtonClick()

    fun onUrlButtonClick(url: String)

}

interface HelplineRouter {

    fun navigateToBrowser(url: String)

}