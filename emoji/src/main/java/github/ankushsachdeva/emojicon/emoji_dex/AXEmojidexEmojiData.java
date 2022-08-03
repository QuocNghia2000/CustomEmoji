/*
 * Copyright (C) 2022 - Amir Hossein Aghajari
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
 */


package github.ankushsachdeva.emojicon.emoji_dex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import github.ankushsachdeva.emojicon.EmojiData;

public class AXEmojidexEmojiData{
    static final AXEmojidexEmojiData instance = new AXEmojidexEmojiData();

    public static final String[] emojiColored = {
            "👐", "🙌", "👏", "🤝", "👍", "👎", "👊", "✊", "🤛", "🤜", "🤞", "✌", "🤘", "👌", "👈", "👉", "👆", "👇", "☝", "✋", "🤚", "🖐", "🖖", "👋", "🤙", "💪", "🖕", "🙏", "👂", "👃", "👶", "👧", "👦", "👩", "🧑", "👨", "👱‍♀", "👱", "👱‍♂", "👵", "👴", "👳‍♀", "👳", "👳‍♂", "🧕", "🧕‍♀", "🧕‍♂", "👮‍♀", "👮", "👮‍♂", "👷‍♀", "👷", "👷‍♂", "💂‍♀", "💂", "💂‍♂", "🕵‍♀", "🕵", "🕵‍♂", "👩‍⚕", "👨‍⚕", "👩‍🌾", "👨‍🌾", "👩‍🍳", "👨‍🍳", "👩‍🎓", "👨‍🎓", "👩‍🎤", "👨‍🎤", "👩‍🏫", "👨‍🏫", "👩‍🏭", "👨‍🏭", "👩‍💻", "👨‍💻", "👩‍💼", "👨‍💼", "👩‍🔧", "👨‍🔧", "👩‍🔬", "👨‍🔬", "👩‍🎨", "👨‍🎨", "👩‍🚒", "👨‍🚒", "👩‍✈", "👨‍✈", "👩‍🚀", "👨‍🚀", "👩‍⚖", "👨‍⚖", "👰", "🤵", "👸", "🤴", "🤶", "🎅", "🧜‍♀", "👼", "🤰", "🤱", "🙇‍♀", "🙇", "🙇‍♂", "💁‍♀", "💁", "💁‍♂", "🙅‍♀", "🙅", "🙅‍♂", "🙆‍♀", "🙆", "🙆‍♂", "🙋", "🤦‍♀", "🤦", "🤦‍♂", "🤷‍♀", "🤷", "🤷‍♂", "🙎‍♀", "🙎", "🙎‍♂", "🙍‍♀", "🙍", "🙍‍♂", "💇", "💆", "💅", "🤳", "💃", "🕺", "👯", "👯‍♂", "🏃", "👭", "👫", "👬", "💑", "💏", "👪", "🏂", "🤸", "🏇", "🧘‍♀", "🧘‍♂", "🏄", "🏊", "🤽", "🚣", "🧗", "🚵", "🚴", "🤹", 
    };

    public static final String[][] dataColored = {
            new String[] {
                    "😀", "😃", "😄", "😁", "😆", "😅", "😂", "🤣", "☺", "😊", "😇", "🙂", "🙃", "😉", "😌", "😍", "😘", "😗", "😙", "😚", "😋", "😛", "😝", "😜", "🤨", "🤓", "😎", "🤩", "😏", "😒", "😞", "😔", "😟", "😕", "🙁", "☹", "😣", "😖", "😫", "😩", "😢", "😭", "😤", "😠", "😡", "😳", "😱", "😨", "😰", "😥", "😓", "🤗", "🤔", "🤥", "😶", "😐", "😑", "😬", "🙄", "😯", "😦", "😧", "😮", "😲", "😴", "🤤", "😪", "😵", "🤐", "🤢", "🤮", "🤧", "😷", "🤒", "🤕", "🤑", "🤠", "😈", "👿", "👹", "👺", "🤡", "💩", "👻", "💀", "☠", "👽", "👾", "🤖", "🎃", "😺", "😸", "😹", "😻", "😼", "😽", "🙀", "😿", "😾", "👐", "🙌", "👏", "🤝", "👍", "👎", "👊", "✊", "🤛", "🤜", "🤞", "✌", "🤘", "👌", "👈", "👉", "👆", "👇", "☝", "✋", "🤚", "🖐", "🖖", "👋", "🤙", "💪", "🖕", "🙏", "💄", "💋", "👄", "👅", "👂", "👃", "👣", "👁", "👀", "🧠", "🗣", "👤", "👥", "👶", "👧", "👦", "👩", "🧑", "👨", "👱‍♀", "👱", "👱‍♂", "👵", "👴", "👲", "👳‍♀", "👳", "👳‍♂", "🧕", "🧕‍♀", "🧕‍♂", "👮‍♀", "👮", "👮‍♂", "👷‍♀", "👷", "👷‍♂", "💂‍♀", "💂", "💂‍♂", "🕵‍♀", "🕵", "🕵‍♂", "👩‍⚕", "👨‍⚕", "👩‍🌾", "👨‍🌾", "👩‍🍳", "👨‍🍳", "👩‍🎓", "👨‍🎓", "👩‍🎤", "👨‍🎤", "👩‍🏫", "👨‍🏫", "👩‍🏭", "👨‍🏭", "👩‍💻", "👨‍💻", "👩‍💼", "👨‍💼", "👩‍🔧", "👨‍🔧", "👩‍🔬", "👨‍🔬", "👩‍🎨", "👨‍🎨", "👩‍🚒", "👨‍🚒", "👩‍✈", "👨‍✈", "👩‍🚀", "👨‍🚀", "👩‍⚖", "👨‍⚖", "👰", "🤵", "👸", "🤴", "🤶", "🎅", "🧜‍♀", "👼", "🤰", "🤱", "🙇‍♀", "🙇", "🙇‍♂", "💁‍♀", "💁", "💁‍♂", "🙅‍♀", "🙅", "🙅‍♂", "🙆‍♀", "🙆", "🙆‍♂", "🙋", "🤦‍♀", "🤦", "🤦‍♂", "🤷‍♀", "🤷", "🤷‍♂", "🙎‍♀", "🙎", "🙎‍♂", "🙍‍♀", "🙍", "🙍‍♂", "💇", "💆", "💅", "🤳", "💃", "🕺", "👯", "👯‍♂", "🕴", "🚶", "🏃", "👭", "👫", "👬", "💑", "💏", "👪", "👚", "👕", "👖", "👔", "👗", "👙", "👘", "👠", "👡", "👢", "👞", "👟", "🧦", "🧤", "🧣", "🎩", "🧢", "👒", "🎓", "⛑", "👑", "💍", "👝", "👛", "👜", "💼", "🎒", "👓", "🕶", "🌂", 
            },
            new String[] {
                    "🐶", "🐱", "🐭", "🐹", "🐰", "🦊", "🐻", "🐼", "🐨", "🐯", "🦁", "🐮", "🐷", "🐽", "🐸", "🐵", "🙈", "🙉", "🙊", "🐒", "🐔", "🐧", "🐦", "🐤", "🐣", "🐥", "🦆", "🦅", "🦉", "🦇", "🐺", "🐗", "🐴", "🦄", "🐝", "🐛", "🦋", "🐌", "🐞", "🐜", "🦗", "🕷", "🕸", "🦂", "🐢", "🐍", "🦎", "🦖", "🦕", "🐙", "🦑", "🦐", "🦀", "🐡", "🐠", "🐟", "🐬", "🐳", "🐋", "🦈", "🐊", "🐅", "🐆", "🦓", "🦍", "🐘", "🦏", "🐪", "🐫", "🦒", "🐃", "🐂", "🐄", "🐎", "🐖", "🐏", "🐑", "🐐", "🦌", "🐕", "🐩", "🐈", "🐓", "🦃", "🕊", "🐇", "🐁", "🐀", "🐿", "🦔", "🐾", "🐉", "🐲", "🌵", "🎄", "🌲", "🌳", "🌴", "🌱", "🌿", "☘", "🍀", "🎍", "🎋", "🍃", "🍂", "🍁", "🍄", "🐚", "🌾", "💐", "🌷", "🌹", "🥀", "🌺", "🌸", "🌼", "🌻", "🌞", "🌝", "🌛", "🌜", "🌚", "🌕", "🌖", "🌗", "🌘", "🌑", "🌒", "🌓", "🌔", "🌙", "🌎", "🌍", "🌏", "💫", "⭐", "🌟", "✨", "⚡", "☄", "💥", "🔥", "🌪", "🌈", "☀", "🌤", "⛅", "🌥", "☁", "🌦", "🌧", "⛈", "🌩", "🌨", "❄", "☃", "⛄", "🌬", "💨", "💧", "💦", "☔", "☂", "🌊", "🌫", 
            },
            new String[] {
                    "🍏", "🍎", "🍐", "🍊", "🍋", "🍌", "🍉", "🍇", "🍓", "🍈", "🍒", "🍑", "🍍", "🥥", "🥝", "🍅", "🍆", "🥑", "🥦", "🥒", "🌶", "🌽", "🥕", "🥔", "🍠", "🥐", "🍞", "🥖", "🥨", "🧀", "🥚", "🍳", "🥞", "🥓", "🥩", "🍗", "🍖", "🌭", "🍔", "🍟", "🍕", "🥪", "🥙", "🌮", "🌯", "🥗", "🥘", "🥫", "🍝", "🍜", "🍲", "🍛", "🍣", "🍱", "🥟", "🍤", "🍙", "🍚", "🍘", "🍥", "🥠", "🍢", "🍡", "🍧", "🍨", "🍦", "🥧", "🍰", "🎂", "🍮", "🍭", "🍬", "🍫", "🍿", "🍩", "🍪", "🌰", "🥜", "🍯", "🥛", "🍼", "☕", "🍵", "🥤", "🍶", "🍺", "🍻", "🥂", "🍷", "🥃", "🍸", "🍹", "🍾", "🥄", "🍴", "🍽", "🥣", "🥡", "🥢", 
            },
            new String[] {
                    "⚽", "🏀", "🏈", "⚾", "🎾", "🏐", "🏉", "🎱", "🏓", "🏸", "🏒", "🏑", "🏏", "🥅", "⛳", "🏹", "🎣", "🥊", "🥋", "🎽", "🛷", "⛸", "🥌", "🎿", "🏂", "🏋", "🤼", "🤸", "⛹", "🤺", "🤾", "🏌", "🏇", "🧘‍♀", "🧘‍♂", "🏄", "🏊", "🤽", "🚣", "🧗", "🚵", "🚴", "🏆", "🥇", "🥈", "🥉", "🏅", "🎖", "🏵", "🎗", "🎫", "🎟", "🎪", "🤹", "🎭", "🎨", "🎬", "🎤", "🎧", "🎼", "🎹", "🥁", "🎷", "🎺", "🎸", "🎻", "🎲", "🎯", "🎳", "🎮", "🎰", 
            },
            new String[] {
                    "🚗", "🚕", "🚙", "🚌", "🚎", "🏎", "🚓", "🚑", "🚒", "🚐", "🚚", "🚛", "🚜", "🛴", "🚲", "🛵", "🏍", "🚨", "🚔", "🚍", "🚘", "🚖", "🚡", "🚠", "🚟", "🚃", "🚋", "🚞", "🚝", "🚄", "🚅", "🚈", "🚂", "🚆", "🚇", "🚊", "🚉", "✈", "🛫", "🛬", "🛩", "💺", "🛰", "🚀", "🛸", "🚁", "🛶", "⛵", "🚤", "🛳", "⛴", "🚢", "⚓", "⛽", "🚧", "🚦", "🚥", "🚏", "🗺", "🗿", "🗽", "🗼", "🏰", "🏯", "🏟", "🎡", "🎢", "🎠", "⛲", "⛱", "🏖", "🏝", "🏜", "🌋", "⛰", "🏔", "🗻", "🏕", "⛺", "🏠", "🏡", "🏘", "🏚", "🏗", "🏭", "🏢", "🏬", "🏣", "🏤", "🏥", "🏦", "🏨", "🏪", "🏫", "🏩", "💒", "🏛", "⛪", "🕌", "🕍", "🕋", "⛩", "🛤", "🛣", "🗾", "🎑", "🏞", "🌅", "🌄", "🌠", "🎇", "🎆", "🌇", "🌆", "🏙", "🌃", "🌌", "🌉", "🌁", 
            },
            new String[] {
                    "⌚", "📱", "📲", "💻", "🖥", "🖨", "🖱", "🖲", "🕹", "🗜", "💽", "💾", "💿", "📀", "📼", "📷", "📸", "📹", "🎥", "📽", "🎞", "📞", "☎", "📟", "📠", "📺", "📻", "🎙", "🎚", "🎛", "⏱", "⏲", "⏰", "🕰", "⌛", "⏳", "📡", "🔋", "🔌", "💡", "🔦", "🕯", "🛢", "💸", "💵", "💴", "💶", "💷", "💰", "💳", "💎", "⚖", "🔧", "🔨", "⚒", "🛠", "⛏", "🔩", "⚙", "⛓", "🔫", "💣", "🔪", "🗡", "⚔", "🛡", "🚬", "⚰", "⚱", "🏺", "🔮", "📿", "💈", "⚗", "🔭", "🔬", "🕳", "💊", "💉", "🌡", "🚽", "🚰", "🚿", "🛁", "🛀", "🛎", "🔑", "🗝", "🚪", "🛋", "🛏", "🖼", "🛍", "🛒", "🎁", "🎈", "🎏", "🎀", "🎊", "🎉", "🎎", "🏮", "🎐", "✉", "📩", "📨", "📧", "💌", "📥", "📤", "📦", "🏷", "📪", "📫", "📬", "📭", "📮", "📯", "📜", "📃", "📄", "📑", "📊", "📈", "📉", "🗒", "🗓", "📆", "📅", "🗑", "📇", "🗃", "🗳", "🗄", "📋", "📁", "📂", "🗂", "🗞", "📰", "📓", "📔", "📒", "📕", "📗", "📘", "📙", "📚", "📖", "🔖", "🔗", "📎", "🖇", "📐", "📏", "📌", "📍", "✂", "🖊", "🖋", "✒", "🖌", "🖍", "📝", "✏", "🔍", "🔎", "🔏", "🔐", "🔒", "🔓", 
            },
            new String[] {
                    "❤", "🧡", "💛", "💚", "💙", "💜", "🖤", "💔", "💕", "💞", "💓", "💗", "💖", "💘", "💝", "💟", "☮", "✝", "☪", "🕉", "☸", "✡", "🔯", "🕎", "☯", "☦", "🛐", "⛎", "♈", "♉", "♊", "♋", "♌", "♍", "♎", "♏", "♐", "♑", "♒", "♓", "🆔", "⚛", "🉑", "☢", "☣", "📴", "📳", "🈶", "🈚", "🈸", "🈺", "🈷", "✴", "🆚", "💮", "🉐", "㊙", "㊗", "🈴", "🈵", "🈹", "🈲", "🅰", "🅱", "🆎", "🆑", "🅾", "🆘", "❌", "⭕", "🛑", "⛔", "📛", "🚫", "💯", "💢", "♨", "🚷", "🚯", "🚳", "🚱", "🔞", "📵", "🚭", "❗", "❕", "❓", "❔", "‼", "⁉", "🔅", "🔆", "〽", "⚠", "🚸", "🔱", "⚜", "🔰", "♻", "✅", "🈯", "💹", "❇", "✳", "❎", "🌐", "Ⓜ", "🌀", "💤", "🏧", "🚾", "♿", "🅿", "🈳", "🈂", "🛂", "🛃", "🛄", "🛅", "🚹", "🚺", "🚼", "🚻", "🚮", "🎦", "📶", "🈁", "🔣", "ℹ", "🔤", "🔡", "🔠", "🆖", "🆗", "🆙", "🆒", "🆕", "🆓", "🔟", "🔢", "⏏", "▶", "⏸", "⏯", "⏹", "⏺", "⏭", "⏮", "⏩", "⏪", "⏫", "⏬", "◀", "🔼", "🔽", "➡", "⬅", "⬆", "⬇", "↗", "↘", "↙", "↖", "↕", "↔", "↪", "↩", "⤴", "⤵", "🔀", "🔁", "🔂", "🔄", "🔃", "🎵", "🎶", "➕", "➖", "➗", "✖", "💲", "💱", "™", "©", "®", "👁‍🗨", "🔚", "🔙", "🔛", "🔝", "🔜", "〰", "➰", "➿", "✔", "☑", "🔘", "🔴", "🔵", "⚫", "⚪", "🔺", "🔻", "🔸", "🔹", "🔶", "🔷", "🔳", "🔲", "▪", "▫", "◾", "◽", "◼", "◻", "⬛", "⬜", "🔈", "🔇", "🔉", "🔊", "🔔", "🔕", "📣", "📢", "💬", "💭", "🗯", "🗨", "♠", "♣", "♥", "♦", "🃏", "🎴", "🀄", "🕐", "🕑", "🕒", "🕓", "🕔", "🕕", "🕖", "🕗", "🕘", "🕙", "🕚", "🕛", "🕜", "🕝", "🕞", "🕟", "🕠", "🕡", "🕢", "🕣", "🕤", "🕥", "🕦", "🕧", 
            },
            new String[] {
                    "🏳", "🏴", "🏴‍☠", "🏁", "🚩", "🏳‍🌈", "🇩🇿", "🇦🇺", "🇦🇹", "🇧🇩", "🇧🇪", "🇧🇦", "🇧🇷", "🇧🇬", "🇨🇲", "🇨🇦", "🇨🇱", "🇨🇳", "🇨🇴", "🇨🇬", "🇨🇷", "🇨🇺", "🇨🇿", "🇩🇰", "🇩🇯", "🇪🇨", "🇪🇬", "🇪🇪", "🇫🇮", "🇫🇷", "🇩🇪", "🇬🇭", "🇬🇷", "🇬🇳", "🇭🇺", "🇮🇸", "🇮🇳", "🇮🇩", "🇮🇷", "🇮🇪", "🇮🇱", "🇮🇹", "🇯🇲", "🇯🇵", "🎌", "🇰🇪", "🇰🇼", "🇱🇺", "🇲🇾", "🇲🇦", "🇳🇵", "🇳🇿", "🇳🇬", "🇰🇵", "🇳🇴", "🇵🇰", "🇵🇭", "🇵🇱", "🇵🇹", "🇷🇴", "🇷🇺", "🇷🇼", "🇸🇦", "🇸🇬", "🇸🇴", "🇿🇦", "🇰🇷", "🇸🇸", "🇪🇸", "🇸🇩", "🇸🇪", "🇨🇭", "🇸🇾", "🇹🇭", "🇹🇷", "🇦🇪", "🇬🇧", "🏴󠁧󠁢󠁥󠁮󠁧󠁿", "🏴󠁧󠁢󠁳󠁣󠁴󠁿", "🏴󠁧󠁢󠁷󠁬󠁳󠁿", "🇺🇸", "🇺🇾", "🇻🇳", "🤻", "🥆",
            },

    };

    public static final String[][] data = {
            new String[] {
                    "😀", "😃", "😄", "😁", "😆", "😅", "😂", "🤣", "☺", "😊", "😇", "🙂", "🙃", "😉", "😌", "😍", "😘", "😗", "😙", "😚", "😋", "😛", "😝", "😜", "🤨", "🤓", "😎", "🤩", "😏", "😒", "😞", "😔", "😟", "😕", "🙁", "☹", "😣", "😖", "😫", "😩", "😢", "😭", "😤", "😠", "😡", "😳", "😱", "😨", "😰", "😥", "😓", "🤗", "🤔", "🤥", "😶", "😐", "😑", "😬", "🙄", "😯", "😦", "😧", "😮", "😲", "😴", "🤤", "😪", "😵", "🤐", "🤢", "🤮", "🤧", "😷", "🤒", "🤕", "🤑", "🤠", "😈", "👿", "👹", "👺", "🤡", "💩", "👻", "💀", "☠", "👽", "👾", "🤖", "🎃", "😺", "😸", "😹", "😻", "😼", "😽", "🙀", "😿", "😾", "👐", "👐🏻", "👐🏼", "👐🏽", "👐🏾", "👐🏿", "🙌", "🙌🏻", "🙌🏼", "🙌🏽", "🙌🏾", "🙌🏿", "👏", "👏🏻", "👏🏼", "👏🏽", "👏🏾", "👏🏿", "🤝", "🤝🏻", "🤝🏼", "🤝🏽", "🤝🏾", "🤝🏿", "👍", "👍🏻", "👍🏼", "👍🏽", "👍🏾", "👍🏿", "👎", "👎🏻", "👎🏼", "👎🏽", "👎🏾", "👎🏿", "👊", "👊🏻", "👊🏼", "👊🏽", "👊🏾", "👊🏿", "✊", "✊🏻", "✊🏼", "✊🏽", "✊🏾", "✊🏿", "🤛", "🤛🏻", "🤛🏼", "🤛🏽", "🤛🏾", "🤛🏿", "🤜", "🤜🏻", "🤜🏼", "🤜🏽", "🤜🏾", "🤜🏿", "🤞", "🤞🏻", "🤞🏼", "🤞🏽", "🤞🏾", "🤞🏿", "✌", "✌🏻", "✌🏼", "✌🏽", "✌🏾", "✌🏿", "🤘", "🤘🏻", "🤘🏼", "🤘🏽", "🤘🏾", "🤘🏿", "👌", "👌🏻", "👌🏼", "👌🏽", "👌🏾", "👌🏿", "👈", "👈🏻", "👈🏼", "👈🏽", "👈🏾", "👈🏿", "👉", "👉🏻", "👉🏼", "👉🏽", "👉🏾", "👉🏿", "👆", "👆🏻", "👆🏼", "👆🏽", "👆🏾", "👆🏿", "👇", "👇🏻", "👇🏼", "👇🏽", "👇🏾", "👇🏿", "☝", "☝🏻", "☝🏼", "☝🏽", "☝🏾", "☝🏿", "✋", "✋🏻", "✋🏼", "✋🏽", "✋🏾", "✋🏿", "🤚", "🤚🏻", "🤚🏼", "🤚🏽", "🤚🏾", "🤚🏿", "🖐", "🖐🏻", "🖐🏼", "🖐🏽", "🖐🏾", "🖐🏿", "🖖", "🖖🏻", "🖖🏼", "🖖🏽", "🖖🏾", "🖖🏿", "👋", "👋🏻", "👋🏼", "👋🏽", "👋🏾", "👋🏿", "🤙", "🤙🏻", "🤙🏼", "🤙🏽", "🤙🏾", "🤙🏿", "💪", "💪🏻", "💪🏼", "💪🏽", "💪🏾", "💪🏿", "🖕", "🖕🏻", "🖕🏼", "🖕🏽", "🖕🏾", "🖕🏿", "🙏", "🙏🏻", "🙏🏼", "🙏🏽", "🙏🏾", "🙏🏿", "💄", "💋", "👄", "👅", "👂", "👂🏻", "👂🏼", "👂🏽", "👂🏾", "👂🏿", "👃", "👃🏻", "👃🏼", "👃🏽", "👃🏾", "👃🏿", "👣", "👁", "👀", "🧠", "🗣", "👤", "👥", "👶", "👶🏻", "👶🏼", "👶🏽", "👶🏾", "👶🏿", "👧", "👧🏻", "👧🏼", "👧🏽", "👧🏾", "👧🏿", "👦", "👦🏻", "👦🏼", "👦🏽", "👦🏾", "👦🏿", "👩", "👩🏻", "👩🏼", "👩🏽", "👩🏾", "👩🏿", "🧑", "🧑🏻", "🧑🏼", "🧑🏽", "🧑🏾", "🧑🏿", "👨", "👨🏻", "👨🏼", "👨🏽", "👨🏾", "👨🏿", "👱‍♀", "👱🏻‍♀", "👱🏼‍♀", "👱🏽‍♀", "👱🏾‍♀", "👱🏿‍♀", "👱", "👱🏻", "👱🏼", "👱🏽", "👱🏾", "👱🏿", "👱‍♂", "👱🏻‍♂", "👱🏼‍♂", "👱🏽‍♂", "👱🏾‍♂", "👱🏿‍♂", "👵", "👵🏻", "👵🏼", "👵🏽", "👵🏾", "👵🏿", "👴", "👴🏻", "👴🏼", "👴🏽", "👴🏾", "👴🏿", "👲", "👳‍♀", "👳🏻‍♀", "👳🏼‍♀", "👳🏽‍♀", "👳🏾‍♀", "👳🏿‍♀", "👳", "👳🏻", "👳🏼", "👳🏽", "👳🏾", "👳🏿", "👳‍♂", "👳🏻‍♂", "👳🏼‍♂", "👳🏽‍♂", "👳🏾‍♂", "👳🏿‍♂", "🧕", "🧕🏻", "🧕🏼", "🧕🏽", "🧕🏾", "🧕🏿", "🧕‍♀", "🧕🏿‍♀", "🧕🏽‍♀", "🧕🏻‍♀", "🧕🏾‍♀", "🧕🏼‍♀", "🧕‍♂", "🧕🏿‍♂", "🧕🏾‍♂", "🧕🏽‍♂", "🧕🏻‍♂", "🧕🏼‍♂", "👮‍♀", "👮🏻‍♀", "👮🏼‍♀", "👮🏽‍♀", "👮🏾‍♀", "👮🏿‍♀", "👮", "👮🏻", "👮🏼", "👮🏽", "👮🏾", "👮🏿", "👮‍♂", "👮🏻‍♂", "👮🏼‍♂", "👮🏽‍♂", "👮🏾‍♂", "👮🏿‍♂", "👷‍♀", "👷🏻‍♀", "👷🏼‍♀", "👷🏽‍♀", "👷🏾‍♀", "👷🏿‍♀", "👷", "👷🏻", "👷🏼", "👷🏽", "👷🏾", "👷🏿", "👷‍♂", "👷🏻‍♂", "👷🏼‍♂", "👷🏽‍♂", "👷🏾‍♂", "👷🏿‍♂", "💂‍♀", "💂🏻‍♀", "💂🏼‍♀", "💂🏽‍♀", "💂🏾‍♀", "💂🏿‍♀", "💂", "💂🏻", "💂🏼", "💂🏽", "💂🏾", "💂🏿", "💂‍♂", "💂🏻‍♂", "💂🏼‍♂", "💂🏽‍♂", "💂🏾‍♂", "💂🏿‍♂", "🕵‍♀", "🕵🏻‍♀", "🕵🏼‍♀", "🕵🏽‍♀", "🕵🏾‍♀", "🕵🏿‍♀", "🕵", "🕵🏻", "🕵🏼", "🕵🏽", "🕵🏾", "🕵🏿", "🕵‍♂", "🕵🏻‍♂", "🕵🏼‍♂", "🕵🏽‍♂", "🕵🏾‍♂", "🕵🏿‍♂", "👩‍⚕", "👩🏻‍⚕", "👩🏼‍⚕", "👩🏽‍⚕", "👩🏾‍⚕", "👩🏿‍⚕", "👨‍⚕", "👨🏻‍⚕", "👨🏼‍⚕", "👨🏽‍⚕", "👨🏾‍⚕", "👨🏿‍⚕", "👩‍🌾", "👩🏻‍🌾", "👩🏼‍🌾", "👩🏽‍🌾", "👩🏾‍🌾", "👩🏿‍🌾", "👨‍🌾", "👨🏻‍🌾", "👨🏼‍🌾", "👨🏽‍🌾", "👨🏾‍🌾", "👨🏿‍🌾", "👩‍🍳", "👩🏻‍🍳", "👩🏼‍🍳", "👩🏽‍🍳", "👩🏾‍🍳", "👩🏿‍🍳", "👨‍🍳", "👨🏻‍🍳", "👨🏼‍🍳", "👨🏽‍🍳", "👨🏾‍🍳", "👨🏿‍🍳", "👩‍🎓", "👩🏻‍🎓", "👩🏼‍🎓", "👩🏽‍🎓", "👩🏾‍🎓", "👩🏿‍🎓", "👨‍🎓", "👨🏻‍🎓", "👨🏼‍🎓", "👨🏽‍🎓", "👨🏾‍🎓", "👨🏿‍🎓", "👩‍🎤", "👩🏻‍🎤", "👩🏼‍🎤", "👩🏽‍🎤", "👩🏾‍🎤", "👩🏿‍🎤", "👨‍🎤", "👨🏻‍🎤", "👨🏼‍🎤", "👨🏽‍🎤", "👨🏾‍🎤", "👨🏿‍🎤", "👩‍🏫", "👩🏻‍🏫", "👩🏼‍🏫", "👩🏽‍🏫", "👩🏾‍🏫", "👩🏿‍🏫", "👨‍🏫", "👨🏻‍🏫", "👨🏼‍🏫", "👨🏽‍🏫", "👨🏾‍🏫", "👨🏿‍🏫", "👩‍🏭", "👩🏻‍🏭", "👩🏼‍🏭", "👩🏽‍🏭", "👩🏾‍🏭", "👩🏿‍🏭", "👨‍🏭", "👨🏻‍🏭", "👨🏼‍🏭", "👨🏽‍🏭", "👨🏾‍🏭", "👨🏿‍🏭", "👩‍💻", "👩🏻‍💻", "👩🏼‍💻", "👩🏽‍💻", "👩🏾‍💻", "👩🏿‍💻", "👨‍💻", "👨🏻‍💻", "👨🏼‍💻", "👨🏽‍💻", "👨🏾‍💻", "👨🏿‍💻", "👩‍💼", "👩🏻‍💼", "👩🏼‍💼", "👩🏽‍💼", "👩🏾‍💼", "👩🏿‍💼", "👨‍💼", "👨🏻‍💼", "👨🏼‍💼", "👨🏽‍💼", "👨🏾‍💼", "👨🏿‍💼", "👩‍🔧", "👩🏻‍🔧", "👩🏼‍🔧", "👩🏽‍🔧", "👩🏾‍🔧", "👩🏿‍🔧", "👨‍🔧", "👨🏻‍🔧", "👨🏼‍🔧", "👨🏽‍🔧", "👨🏾‍🔧", "👨🏿‍🔧", "👩‍🔬", "👩🏻‍🔬", "👩🏼‍🔬", "👩🏽‍🔬", "👩🏾‍🔬", "👩🏿‍🔬", "👨‍🔬", "👨🏻‍🔬", "👨🏼‍🔬", "👨🏽‍🔬", "👨🏾‍🔬", "👨🏿‍🔬", "👩‍🎨", "👩🏻‍🎨", "👩🏼‍🎨", "👩🏽‍🎨", "👩🏾‍🎨", "👩🏿‍🎨", "👨‍🎨", "👨🏻‍🎨", "👨🏼‍🎨", "👨🏽‍🎨", "👨🏾‍🎨", "👨🏿‍🎨", "👩‍🚒", "👩🏻‍🚒", "👩🏼‍🚒", "👩🏽‍🚒", "👩🏾‍🚒", "👩🏿‍🚒", "👨‍🚒", "👨🏻‍🚒", "👨🏼‍🚒", "👨🏽‍🚒", "👨🏾‍🚒", "👨🏿‍🚒", "👩‍✈", "👩🏻‍✈", "👩🏼‍✈", "👩🏽‍✈", "👩🏾‍✈", "👩🏿‍✈", "👨‍✈", "👨🏻‍✈", "👨🏼‍✈", "👨🏽‍✈", "👨🏾‍✈", "👨🏿‍✈", "👩‍🚀", "👩🏻‍🚀", "👩🏼‍🚀", "👩🏽‍🚀", "👩🏾‍🚀", "👩🏿‍🚀", "👨‍🚀", "👨🏻‍🚀", "👨🏼‍🚀", "👨🏽‍🚀", "👨🏾‍🚀", "👨🏿‍🚀", "👩‍⚖", "👩🏻‍⚖", "👩🏼‍⚖", "👩🏽‍⚖", "👩🏾‍⚖", "👩🏿‍⚖", "👨‍⚖", "👨🏻‍⚖", "👨🏼‍⚖", "👨🏽‍⚖", "👨🏾‍⚖", "👨🏿‍⚖", "👰", "👰🏻", "👰🏼", "👰🏽", "👰🏾", "👰🏿", "🤵", "🤵🏻", "🤵🏼", "🤵🏽", "🤵🏾", "🤵🏿", "👸", "👸🏻", "👸🏼", "👸🏽", "👸🏾", "👸🏿", "🤴", "🤴🏻", "🤴🏼", "🤴🏽", "🤴🏾", "🤴🏿", "🤶", "🤶🏻", "🤶🏼", "🤶🏽", "🤶🏾", "🤶🏿", "🎅", "🎅🏻", "🎅🏼", "🎅🏽", "🎅🏾", "🎅🏿", "🧜‍♀", "🧜🏻‍♀", "🧜🏼‍♀", "🧜🏽‍♀", "🧜🏾‍♀", "🧜🏿‍♀", "👼", "👼🏻", "👼🏼", "👼🏽", "👼🏾", "👼🏿", "🤰", "🤰🏻", "🤰🏼", "🤰🏽", "🤰🏾", "🤰🏿", "🤱", "🤱🏻", "🤱🏼", "🤱🏽", "🤱🏾", "🤱🏿", "🙇‍♀", "🙇🏻‍♀", "🙇🏼‍♀", "🙇🏽‍♀", "🙇🏾‍♀", "🙇🏿‍♀", "🙇", "🙇🏻", "🙇🏼", "🙇🏽", "🙇🏾", "🙇🏿", "🙇‍♂", "🙇🏻‍♂", "🙇🏼‍♂", "🙇🏽‍♂", "🙇🏾‍♂", "🙇🏿‍♂", "💁‍♀", "💁🏻‍♀", "💁🏼‍♀", "💁🏽‍♀", "💁🏾‍♀", "💁🏿‍♀", "💁", "💁🏻", "💁🏼", "💁🏽", "💁🏾", "💁🏿", "💁‍♂", "💁🏻‍♂", "💁🏼‍♂", "💁🏽‍♂", "💁🏾‍♂", "💁🏿‍♂", "🙅‍♀", "🙅🏻‍♀", "🙅🏼‍♀", "🙅🏽‍♀", "🙅🏾‍♀", "🙅🏿‍♀", "🙅", "🙅🏻", "🙅🏼", "🙅🏽", "🙅🏾", "🙅🏿", "🙅‍♂", "🙅🏻‍♂", "🙅🏼‍♂", "🙅🏽‍♂", "🙅🏾‍♂", "🙅🏿‍♂", "🙆‍♀", "🙆🏻‍♀", "🙆🏼‍♀", "🙆🏽‍♀", "🙆🏾‍♀", "🙆🏿‍♀", "🙆", "🙆🏻", "🙆🏼", "🙆🏽", "🙆🏾", "🙆🏿", "🙆‍♂", "🙆🏻‍♂", "🙆🏼‍♂", "🙆🏽‍♂", "🙆🏾‍♂", "🙆🏿‍♂", "🙋", "🙋🏻", "🙋🏼", "🙋🏽", "🙋🏾", "🙋🏿", "🤦‍♀", "🤦🏻‍♀", "🤦🏼‍♀", "🤦🏽‍♀", "🤦🏾‍♀", "🤦🏿‍♀", "🤦", "🤦🏻", "🤦🏼", "🤦🏽", "🤦🏾", "🤦🏿", "🤦‍♂", "🤦🏻‍♂", "🤦🏼‍♂", "🤦🏽‍♂", "🤦🏾‍♂", "🤦🏿‍♂", "🤷‍♀", "🤷🏻‍♀", "🤷🏼‍♀", "🤷🏽‍♀", "🤷🏾‍♀", "🤷🏿‍♀", "🤷", "🤷🏻", "🤷🏼", "🤷🏽", "🤷🏾", "🤷🏿", "🤷‍♂", "🤷🏻‍♂", "🤷🏼‍♂", "🤷🏽‍♂", "🤷🏾‍♂", "🤷🏿‍♂", "🙎‍♀", "🙎🏻‍♀", "🙎🏼‍♀", "🙎🏽‍♀", "🙎🏾‍♀", "🙎🏿‍♀", "🙎", "🙎🏻", "🙎🏼", "🙎🏽", "🙎🏾", "🙎🏿", "🙎‍♂", "🙎🏻‍♂", "🙎🏼‍♂", "🙎🏽‍♂", "🙎🏾‍♂", "🙎🏿‍♂", "🙍‍♀", "🙍🏻‍♀", "🙍🏼‍♀", "🙍🏽‍♀", "🙍🏾‍♀", "🙍🏿‍♀", "🙍", "🙍🏻", "🙍🏼", "🙍🏽", "🙍🏾", "🙍🏿", "🙍‍♂", "🙍🏻‍♂", "🙍🏼‍♂", "🙍🏽‍♂", "🙍🏾‍♂", "🙍🏿‍♂", "💇", "💇🏻", "💇🏼", "💇🏽", "💇🏾", "💇🏿", "💆", "💆🏻", "💆🏼", "💆🏽", "💆🏾", "💆🏿", "💅", "💅🏻", "💅🏼", "💅🏽", "💅🏾", "💅🏿", "🤳", "🤳🏻", "🤳🏼", "🤳🏽", "🤳🏾", "🤳🏿", "💃", "💃🏻", "💃🏼", "💃🏽", "💃🏾", "💃🏿", "🕺", "🕺🏻", "🕺🏼", "🕺🏽", "🕺🏾", "🕺🏿", "👯", "👯🏻", "👯🏼", "👯🏽", "👯🏾", "👯🏿", "👯‍♂", "👯🏻‍♂", "👯🏼‍♂", "👯🏽‍♂", "👯🏾‍♂", "👯🏿‍♂", "🕴", "🚶", "🏃", "🏃🏻", "🏃🏼", "🏃🏽", "🏃🏾", "🏃🏿", "👭", "👭🏻", "👭🏼", "👭🏽", "👭🏾", "👭🏿", "👫", "👫🏻", "👫🏼", "👫🏽", "👫🏾", "👫🏿", "👬", "👬🏻", "👬🏼", "👬🏽", "👬🏾", "👬🏿", "💑", "💑🏻", "💑🏼", "💑🏽", "💑🏾", "💑🏿", "💏", "💏🏻", "💏🏼", "💏🏽", "💏🏾", "💏🏿", "👪", "👪🏻", "👪🏼", "👪🏽", "👪🏾", "👪🏿", "👚", "👕", "👖", "👔", "👗", "👙", "👘", "👠", "👡", "👢", "👞", "👟", "🧦", "🧤", "🧣", "🎩", "🧢", "👒", "🎓", "⛑", "👑", "💍", "👝", "👛", "👜", "💼", "🎒", "👓", "🕶", "🌂", 
            },
            new String[] {
                    "🐶", "🐱", "🐭", "🐹", "🐰", "🦊", "🐻", "🐼", "🐨", "🐯", "🦁", "🐮", "🐷", "🐽", "🐸", "🐵", "🙈", "🙉", "🙊", "🐒", "🐔", "🐧", "🐦", "🐤", "🐣", "🐥", "🦆", "🦅", "🦉", "🦇", "🐺", "🐗", "🐴", "🦄", "🐝", "🐛", "🦋", "🐌", "🐞", "🐜", "🦗", "🕷", "🕸", "🦂", "🐢", "🐍", "🦎", "🦖", "🦕", "🐙", "🦑", "🦐", "🦀", "🐡", "🐠", "🐟", "🐬", "🐳", "🐋", "🦈", "🐊", "🐅", "🐆", "🦓", "🦍", "🐘", "🦏", "🐪", "🐫", "🦒", "🐃", "🐂", "🐄", "🐎", "🐖", "🐏", "🐑", "🐐", "🦌", "🐕", "🐩", "🐈", "🐓", "🦃", "🕊", "🐇", "🐁", "🐀", "🐿", "🦔", "🐾", "🐉", "🐲", "🌵", "🎄", "🌲", "🌳", "🌴", "🌱", "🌿", "☘", "🍀", "🎍", "🎋", "🍃", "🍂", "🍁", "🍄", "🐚", "🌾", "💐", "🌷", "🌹", "🥀", "🌺", "🌸", "🌼", "🌻", "🌞", "🌝", "🌛", "🌜", "🌚", "🌕", "🌖", "🌗", "🌘", "🌑", "🌒", "🌓", "🌔", "🌙", "🌎", "🌍", "🌏", "💫", "⭐", "🌟", "✨", "⚡", "☄", "💥", "🔥", "🌪", "🌈", "☀", "🌤", "⛅", "🌥", "☁", "🌦", "🌧", "⛈", "🌩", "🌨", "❄", "☃", "⛄", "🌬", "💨", "💧", "💦", "☔", "☂", "🌊", "🌫", 
            },
            new String[] {
                    "🍏", "🍎", "🍐", "🍊", "🍋", "🍌", "🍉", "🍇", "🍓", "🍈", "🍒", "🍑", "🍍", "🥥", "🥝", "🍅", "🍆", "🥑", "🥦", "🥒", "🌶", "🌽", "🥕", "🥔", "🍠", "🥐", "🍞", "🥖", "🥨", "🧀", "🥚", "🍳", "🥞", "🥓", "🥩", "🍗", "🍖", "🌭", "🍔", "🍟", "🍕", "🥪", "🥙", "🌮", "🌯", "🥗", "🥘", "🥫", "🍝", "🍜", "🍲", "🍛", "🍣", "🍱", "🥟", "🍤", "🍙", "🍚", "🍘", "🍥", "🥠", "🍢", "🍡", "🍧", "🍨", "🍦", "🥧", "🍰", "🎂", "🍮", "🍭", "🍬", "🍫", "🍿", "🍩", "🍪", "🌰", "🥜", "🍯", "🥛", "🍼", "☕", "🍵", "🥤", "🍶", "🍺", "🍻", "🥂", "🍷", "🥃", "🍸", "🍹", "🍾", "🥄", "🍴", "🍽", "🥣", "🥡", "🥢", 
            },
            new String[] {
                    "⚽", "🏀", "🏈", "⚾", "🎾", "🏐", "🏉", "🎱", "🏓", "🏸", "🏒", "🏑", "🏏", "🥅", "⛳", "🏹", "🎣", "🥊", "🥋", "🎽", "🛷", "⛸", "🥌", "🎿", "🏂", "🏂🏻", "🏂🏼", "🏂🏽", "🏂🏾", "🏂🏿", "🏋", "🤼", "🤸", "🤸🏻", "🤸🏼", "🤸🏽", "🤸🏾", "🤸🏿", "⛹", "🤺", "🤾", "🏌", "🏇", "🏇🏻", "🏇🏼", "🏇🏽", "🏇🏾", "🏇🏿", "🧘‍♀", "🧘🏻‍♀", "🧘🏼‍♀", "🧘🏽‍♀", "🧘🏾‍♀", "🧘🏿‍♀", "🧘‍♂", "🧘🏻‍♂", "🧘🏼‍♂", "🧘🏽‍♂", "🧘🏾‍♂", "🧘🏿‍♂", "🏄", "🏄🏻", "🏄🏼", "🏄🏽", "🏄🏾", "🏄🏿", "🏊", "🏊🏻", "🏊🏼", "🏊🏽", "🏊🏾", "🏊🏿", "🤽", "🤽🏻", "🤽🏼", "🤽🏽", "🤽🏾", "🤽🏿", "🚣", "🚣🏻", "🚣🏼", "🚣🏽", "🚣🏾", "🚣🏿", "🧗", "🧗🏻", "🧗🏼", "🧗🏽", "🧗🏾", "🧗🏿", "🚵", "🚵🏻", "🚵🏼", "🚵🏽", "🚵🏾", "🚵🏿", "🚴", "🚴🏻", "🚴🏼", "🚴🏽", "🚴🏾", "🚴🏿", "🏆", "🥇", "🥈", "🥉", "🏅", "🎖", "🏵", "🎗", "🎫", "🎟", "🎪", "🤹", "🤹🏻", "🤹🏼", "🤹🏽", "🤹🏾", "🤹🏿", "🎭", "🎨", "🎬", "🎤", "🎧", "🎼", "🎹", "🥁", "🎷", "🎺", "🎸", "🎻", "🎲", "🎯", "🎳", "🎮", "🎰", "🤼🏻", "🤼🏼", "🤼🏽", "🤼🏾", "🤼🏿", 
            },
            new String[] {
                    "🚗", "🚕", "🚙", "🚌", "🚎", "🏎", "🚓", "🚑", "🚒", "🚐", "🚚", "🚛", "🚜", "🛴", "🚲", "🛵", "🏍", "🚨", "🚔", "🚍", "🚘", "🚖", "🚡", "🚠", "🚟", "🚃", "🚋", "🚞", "🚝", "🚄", "🚅", "🚈", "🚂", "🚆", "🚇", "🚊", "🚉", "✈", "🛫", "🛬", "🛩", "💺", "🛰", "🚀", "🛸", "🚁", "🛶", "⛵", "🚤", "🛳", "⛴", "🚢", "⚓", "⛽", "🚧", "🚦", "🚥", "🚏", "🗺", "🗿", "🗽", "🗼", "🏰", "🏯", "🏟", "🎡", "🎢", "🎠", "⛲", "⛱", "🏖", "🏝", "🏜", "🌋", "⛰", "🏔", "🗻", "🏕", "⛺", "🏠", "🏡", "🏘", "🏚", "🏗", "🏭", "🏢", "🏬", "🏣", "🏤", "🏥", "🏦", "🏨", "🏪", "🏫", "🏩", "💒", "🏛", "⛪", "🕌", "🕍", "🕋", "⛩", "🛤", "🛣", "🗾", "🎑", "🏞", "🌅", "🌄", "🌠", "🎇", "🎆", "🌇", "🌆", "🏙", "🌃", "🌌", "🌉", "🌁", 
            },
            new String[] {
                    "⌚", "📱", "📲", "💻", "🖥", "🖨", "🖱", "🖲", "🕹", "🗜", "💽", "💾", "💿", "📀", "📼", "📷", "📸", "📹", "🎥", "📽", "🎞", "📞", "☎", "📟", "📠", "📺", "📻", "🎙", "🎚", "🎛", "⏱", "⏲", "⏰", "🕰", "⌛", "⏳", "📡", "🔋", "🔌", "💡", "🔦", "🕯", "🛢", "💸", "💵", "💴", "💶", "💷", "💰", "💳", "💎", "⚖", "🔧", "🔨", "⚒", "🛠", "⛏", "🔩", "⚙", "⛓", "🔫", "💣", "🔪", "🗡", "⚔", "🛡", "🚬", "⚰", "⚱", "🏺", "🔮", "📿", "💈", "⚗", "🔭", "🔬", "🕳", "💊", "💉", "🌡", "🚽", "🚰", "🚿", "🛁", "🛀", "🛎", "🔑", "🗝", "🚪", "🛋", "🛏", "🖼", "🛍", "🛒", "🎁", "🎈", "🎏", "🎀", "🎊", "🎉", "🎎", "🏮", "🎐", "✉", "📩", "📨", "📧", "💌", "📥", "📤", "📦", "🏷", "📪", "📫", "📬", "📭", "📮", "📯", "📜", "📃", "📄", "📑", "📊", "📈", "📉", "🗒", "🗓", "📆", "📅", "🗑", "📇", "🗃", "🗳", "🗄", "📋", "📁", "📂", "🗂", "🗞", "📰", "📓", "📔", "📒", "📕", "📗", "📘", "📙", "📚", "📖", "🔖", "🔗", "📎", "🖇", "📐", "📏", "📌", "📍", "✂", "🖊", "🖋", "✒", "🖌", "🖍", "📝", "✏", "🔍", "🔎", "🔏", "🔐", "🔒", "🔓", 
            },
            new String[] {
                    "❤", "🧡", "💛", "💚", "💙", "💜", "🖤", "💔", "💕", "💞", "💓", "💗", "💖", "💘", "💝", "💟", "☮", "✝", "☪", "🕉", "☸", "✡", "🔯", "🕎", "☯", "☦", "🛐", "⛎", "♈", "♉", "♊", "♋", "♌", "♍", "♎", "♏", "♐", "♑", "♒", "♓", "🆔", "⚛", "🉑", "☢", "☣", "📴", "📳", "🈶", "🈚", "🈸", "🈺", "🈷", "✴", "🆚", "💮", "🉐", "㊙", "㊗", "🈴", "🈵", "🈹", "🈲", "🅰", "🅱", "🆎", "🆑", "🅾", "🆘", "❌", "⭕", "🛑", "⛔", "📛", "🚫", "💯", "💢", "♨", "🚷", "🚯", "🚳", "🚱", "🔞", "📵", "🚭", "❗", "❕", "❓", "❔", "‼", "⁉", "🔅", "🔆", "〽", "⚠", "🚸", "🔱", "⚜", "🔰", "♻", "✅", "🈯", "💹", "❇", "✳", "❎", "🌐", "Ⓜ", "🌀", "💤", "🏧", "🚾", "♿", "🅿", "🈳", "🈂", "🛂", "🛃", "🛄", "🛅", "🚹", "🚺", "🚼", "🚻", "🚮", "🎦", "📶", "🈁", "🔣", "ℹ", "🔤", "🔡", "🔠", "🆖", "🆗", "🆙", "🆒", "🆕", "🆓", "🔟", "🔢", "⏏", "▶", "⏸", "⏯", "⏹", "⏺", "⏭", "⏮", "⏩", "⏪", "⏫", "⏬", "◀", "🔼", "🔽", "➡", "⬅", "⬆", "⬇", "↗", "↘", "↙", "↖", "↕", "↔", "↪", "↩", "⤴", "⤵", "🔀", "🔁", "🔂", "🔄", "🔃", "🎵", "🎶", "➕", "➖", "➗", "✖", "💲", "💱", "™", "©", "®", "👁‍🗨", "🔚", "🔙", "🔛", "🔝", "🔜", "〰", "➰", "➿", "✔", "☑", "🔘", "🔴", "🔵", "⚫", "⚪", "🔺", "🔻", "🔸", "🔹", "🔶", "🔷", "🔳", "🔲", "▪", "▫", "◾", "◽", "◼", "◻", "⬛", "⬜", "🔈", "🔇", "🔉", "🔊", "🔔", "🔕", "📣", "📢", "💬", "💭", "🗯", "🗨", "♠", "♣", "♥", "♦", "🃏", "🎴", "🀄", "🕐", "🕑", "🕒", "🕓", "🕔", "🕕", "🕖", "🕗", "🕘", "🕙", "🕚", "🕛", "🕜", "🕝", "🕞", "🕟", "🕠", "🕡", "🕢", "🕣", "🕤", "🕥", "🕦", "🕧", "♀️", "♂️", "⚕️", 
            },
            new String[] {
                    "🏳", "🏴", "🏴‍☠", "🏁", "🚩", "🏳‍🌈", "🇩🇿", "🇦🇺", "🇦🇹", "🇧🇩", "🇧🇪", "🇧🇦", "🇧🇷", "🇧🇬", "🇨🇲", "🇨🇦", "🇨🇱", "🇨🇳", "🇨🇴", "🇨🇬", "🇨🇷", "🇨🇺", "🇨🇿", "🇩🇰", "🇩🇯", "🇪🇨", "🇪🇬", "🇪🇪", "🇫🇮", "🇫🇷", "🇩🇪", "🇬🇭", "🇬🇷", "🇬🇳", "🇭🇺", "🇮🇸", "🇮🇳", "🇮🇩", "🇮🇷", "🇮🇪", "🇮🇱", "🇮🇹", "🇯🇲", "🇯🇵", "🎌", "🇰🇪", "🇰🇼", "🇱🇺", "🇲🇾", "🇲🇦", "🇳🇵", "🇳🇿", "🇳🇬", "🇰🇵", "🇳🇴", "🇵🇰", "🇵🇭", "🇵🇱", "🇵🇹", "🇷🇴", "🇷🇺", "🇷🇼", "🇸🇦", "🇸🇬", "🇸🇴", "🇿🇦", "🇰🇷", "🇸🇸", "🇪🇸", "🇸🇩", "🇸🇪", "🇨🇭", "🇸🇾", "🇹🇭", "🇹🇷", "🇦🇪", "🇬🇧", "🏴󠁧󠁢󠁥󠁮󠁧󠁿", "🏴󠁧󠁢󠁳󠁣󠁴󠁿", "🏴󠁧󠁢󠁷󠁬󠁳󠁿", "🇺🇸", "🇺🇾", "🇻🇳", "🇦", "🇧", "🇨", "🇩", "🇪", "🇫", "🇬", "🇭", "🇮", "🇯", "🇰", "🇱", "🇲", "🇳", "🇴", "🇵", "🇶", "🇷", "🇸", "🇹", "🇺", "🇻", "🇼", "🇽", "🇾", "🇿", "🤻", "🥆", "◯‍◯‍◯‍◯‍◯", "☿️", 
            },
    };

    
    public final static ArrayList<String>getDataRow0() {
        return new ArrayList<>(Arrays.asList(data[0]));
    }

    
    public final static ArrayList<String>getDataRow1() {
        return new ArrayList<>(Arrays.asList(data[1]));
    }

    
    public final static ArrayList<String>getDataRow2() {
        return new ArrayList<>(Arrays.asList(data[2]));
    }

    
    public final static ArrayList<String>getDataRow3() {
        return new ArrayList<>(Arrays.asList(data[3]));
    }

    
    public final static ArrayList<String>getDataRow4() {
        return new ArrayList<>(Arrays.asList(data[4]));
    }

    
    public final static ArrayList<String>getDataRow5() {
        return new ArrayList<>(Arrays.asList(data[5]));
    }

    
    public final static ArrayList<String>getDataRow6() {
        return new ArrayList<>(Arrays.asList(data[6]));
    }

    
    public final static ArrayList<String>getDataRow7() {
        return new ArrayList<>(Arrays.asList(data[7]));
    }


    public final static ArrayList<String> getCategories()
    {
        ArrayList<String> temp = new ArrayList<>();
        temp.add(getDataRow0().get(0));
        temp.add(getDataRow1().get(0));
        temp.add(getDataRow2().get(0));
        temp.add(getDataRow3().get(0));
        temp.add(getDataRow4().get(0));
        temp.add(getDataRow5().get(0));
        temp.add(getDataRow6().get(0));
        temp.add(getDataRow7().get(0));
        return temp;
    }
}

