/**
 * Copyright 2012 wallet.org
 *
 * Licensed under the MIT license (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://opensource.org/licenses/mit-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wallet.viewsystem.swing.view.components;

import javax.swing.JLabel;


public class WorldcoinWalletLabel extends JLabel {

    private static final long serialVersionUID = -3434455262992702604L;

    public WorldcoinWalletLabel(String labelText, int alignment) {
        super(labelText, alignment);
        setFont(FontSizer.INSTANCE.getAdjustedDefaultFont());
        setOpaque(false);
    }

    public WorldcoinWalletLabel(String labelText) {
        super(labelText);
        setFont(FontSizer.INSTANCE.getAdjustedDefaultFont());
        setOpaque(false);
    }
}
