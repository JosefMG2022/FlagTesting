package com.example.flagtesting

import java.util.*

data class CountryCode(
    var countryCode: String,
    val countryPhoneCode: String = "",
    val countryName: String = "",
    val flagResID: Int = 0
)

fun getFlags(countryName: String): Int {
    return when (countryName) {
        "ad" -> R.drawable.flag_andorra
        "ae" -> R.drawable.flag_uae
        "af" -> R.drawable.flag_afghanistan
        "ag" -> R.drawable.flag_antigua_and_barbuda
        "ai" -> R.drawable.flag_anguilla
        "al" -> R.drawable.flag_albania
        "am" -> R.drawable.flag_armenia
        "ao" -> R.drawable.flag_angola
        "aq" -> R.drawable.flag_antarctica
        "ar" -> R.drawable.flag_argentina
        "as" -> R.drawable.flag_american_samoa
        "at" -> R.drawable.flag_austria
        "au" -> R.drawable.flag_australia
        "aw" -> R.drawable.flag_aruba
        "ax" -> R.drawable.flag_aland
        "az" -> R.drawable.flag_azerbaijan
        "ba" -> R.drawable.flag_bosnia
        "bb" -> R.drawable.flag_barbados
        "bd" -> R.drawable.flag_bangladesh
        "be" -> R.drawable.flag_belgium
        "bf" -> R.drawable.flag_burkina_faso
        "bg" -> R.drawable.flag_bulgaria
        "bh" -> R.drawable.flag_bahrain
        "bi" -> R.drawable.flag_burundi
        "bj" -> R.drawable.flag_benin
        "bl" -> R.drawable.flag_saint_barthelemy // custom
        "bm" -> R.drawable.flag_bermuda
        "bn" -> R.drawable.flag_brunei
        "bo" -> R.drawable.flag_bolivia
        "br" -> R.drawable.flag_brazil
        "bs" -> R.drawable.flag_bahamas
        "bt" -> R.drawable.flag_bhutan
        "bw" -> R.drawable.flag_botswana
        "by" -> R.drawable.flag_belarus
        "bz" -> R.drawable.flag_belize
        "ca" -> R.drawable.flag_canada
        "cc" -> R.drawable.flag_cocos // custom
        "cd" -> R.drawable.flag_democratic_republic_of_the_congo
        "cf" -> R.drawable.flag_central_african_republic
        "cg" -> R.drawable.flag_republic_of_the_congo
        "ch" -> R.drawable.flag_switzerland
        "ci" -> R.drawable.flag_cote_divoire
        "ck" -> R.drawable.flag_cook_islands
        "cl" -> R.drawable.flag_chile
        "cm" -> R.drawable.flag_cameroon
        "cn" -> R.drawable.flag_china
        "co" -> R.drawable.flag_colombia
        "cr" -> R.drawable.flag_costa_rica
        "cu" -> R.drawable.flag_cuba
        "cv" -> R.drawable.flag_cape_verde
        "cw" -> R.drawable.flag_curacao
        "cx" -> R.drawable.flag_christmas_island
        "cy" -> R.drawable.flag_cyprus
        "cz" -> R.drawable.flag_czech_republic
        "de" -> R.drawable.flag_germany
        "dj" -> R.drawable.flag_djibouti
        "dk" -> R.drawable.flag_denmark
        "dm" -> R.drawable.flag_dominica
        "do" -> R.drawable.flag_dominican_republic
        "dz" -> R.drawable.flag_algeria
        "ec" -> R.drawable.flag_ecuador
        "ee" -> R.drawable.flag_estonia
        "eg" -> R.drawable.flag_egypt
        "er" -> R.drawable.flag_eritrea
        "es" -> R.drawable.flag_spain
        "et" -> R.drawable.flag_ethiopia
        "fi" -> R.drawable.flag_finland
        "fj" -> R.drawable.flag_fiji
        "fk" -> R.drawable.flag_falkland_islands
        "fm" -> R.drawable.flag_micronesia
        "fo" -> R.drawable.flag_faroe_islands
        "fr" -> R.drawable.flag_france
        "ga" -> R.drawable.flag_gabon
        "gb" -> R.drawable.flag_united_kingdom
        "gd" -> R.drawable.flag_grenada
        "ge" -> R.drawable.flag_georgia
        "gf" -> R.drawable.flag_guyane
        "gg" -> R.drawable.flag_guernsey
        "gh" -> R.drawable.flag_ghana
        "gi" -> R.drawable.flag_gibraltar
        "gl" -> R.drawable.flag_greenland
        "gm" -> R.drawable.flag_gambia
        "gn" -> R.drawable.flag_guinea
        "gp" -> R.drawable.flag_guadeloupe
        "gq" -> R.drawable.flag_equatorial_guinea
        "gr" -> R.drawable.flag_greece
        "gt" -> R.drawable.flag_guatemala
        "gu" -> R.drawable.flag_guam
        "gw" -> R.drawable.flag_guinea_bissau
        "gy" -> R.drawable.flag_guyana
        "hk" -> R.drawable.flag_hong_kong
        "hn" -> R.drawable.flag_honduras
        "hr" -> R.drawable.flag_croatia
        "ht" -> R.drawable.flag_haiti
        "hu" -> R.drawable.flag_hungary
        "id" -> R.drawable.flag_indonesia
        "ie" -> R.drawable.flag_ireland
        "im" -> R.drawable.flag_isleof_man // custom
        "is" -> R.drawable.flag_iceland
        "in" -> R.drawable.flag_india
        "io" -> R.drawable.flag_british_indian_ocean_territory
        "iq" -> R.drawable.flag_iraq_new
        "ir" -> R.drawable.flag_iran
        "it" -> R.drawable.flag_italy
        "je" -> R.drawable.flag_jersey
        "jm" -> R.drawable.flag_jamaica
        "jo" -> R.drawable.flag_jordan
        "jp" -> R.drawable.flag_japan
        "ke" -> R.drawable.flag_kenya
        "kg" -> R.drawable.flag_kyrgyzstan
        "kh" -> R.drawable.flag_cambodia
        "ki" -> R.drawable.flag_kiribati
        "km" -> R.drawable.flag_comoros
        "kn" -> R.drawable.flag_saint_kitts_and_nevis
        "kp" -> R.drawable.flag_north_korea
        "kr" -> R.drawable.flag_south_korea
        "kw" -> R.drawable.flag_kuwait
        "ky" -> R.drawable.flag_cayman_islands
        "kz" -> R.drawable.flag_kazakhstan
        "la" -> R.drawable.flag_laos
        "lb" -> R.drawable.flag_lebanon
        "lc" -> R.drawable.flag_saint_lucia
        "li" -> R.drawable.flag_liechtenstein
        "lk" -> R.drawable.flag_sri_lanka
        "lr" -> R.drawable.flag_liberia
        "ls" -> R.drawable.flag_lesotho
        "lt" -> R.drawable.flag_lithuania
        "lu" -> R.drawable.flag_luxembourg
        "lv" -> R.drawable.flag_latvia
        "ly" -> R.drawable.flag_libya
        "ma" -> R.drawable.flag_morocco
        "mc" -> R.drawable.flag_monaco
        "md" -> R.drawable.flag_moldova
        "me" -> R.drawable.flag_of_montenegro // custom
        "mf" -> R.drawable.flag_saint_martin
        "mg" -> R.drawable.flag_madagascar
        "mh" -> R.drawable.flag_marshall_islands
        "mk" -> R.drawable.flag_macedonia
        "ml" -> R.drawable.flag_mali
        "mm" -> R.drawable.flag_myanmar
        "mn" -> R.drawable.flag_mongolia
        "mo" -> R.drawable.flag_macao
        "mp" -> R.drawable.flag_northern_mariana_islands
        "mq" -> R.drawable.flag_martinique
        "mr" -> R.drawable.flag_mauritania
        "ms" -> R.drawable.flag_montserrat
        "mt" -> R.drawable.flag_malta
        "mu" -> R.drawable.flag_mauritius
        "mv" -> R.drawable.flag_maldives
        "mw" -> R.drawable.flag_malawi
        "mx" -> R.drawable.flag_mexico
        "my" -> R.drawable.flag_malaysia
        "mz" -> R.drawable.flag_mozambique
        "na" -> R.drawable.flag_namibia
        "nc" -> R.drawable.flag_new_caledonia // custom
        "ne" -> R.drawable.flag_niger
        "nf" -> R.drawable.flag_norfolk_island
        "ng" -> R.drawable.flag_nigeria
        "ni" -> R.drawable.flag_nicaragua
        "nl" -> R.drawable.flag_netherlands
        "no" -> R.drawable.flag_norway
        "np" -> R.drawable.flag_nepal
        "nr" -> R.drawable.flag_nauru
        "nu" -> R.drawable.flag_niue
        "nz" -> R.drawable.flag_new_zealand
        "om" -> R.drawable.flag_oman
        "pa" -> R.drawable.flag_panama
        "pe" -> R.drawable.flag_peru
        "pf" -> R.drawable.flag_french_polynesia
        "pg" -> R.drawable.flag_papua_new_guinea
        "ph" -> R.drawable.flag_philippines
        "pk" -> R.drawable.flag_pakistan
        "pl" -> R.drawable.flag_poland
        "pm" -> R.drawable.flag_saint_pierre
        "pn" -> R.drawable.flag_pitcairn_islands
        "pr" -> R.drawable.flag_puerto_rico
        "ps" -> R.drawable.flag_palestine
        "pt" -> R.drawable.flag_portugal
        "pw" -> R.drawable.flag_palau
        "py" -> R.drawable.flag_paraguay
        "qa" -> R.drawable.flag_qatar
        "re" -> R.drawable.flag_martinique // no exact flag found
        "ro" -> R.drawable.flag_romania
        "rs" -> R.drawable.flag_serbia // custom
        "ru" -> R.drawable.flag_russian_federation
        "rw" -> R.drawable.flag_rwanda
        "sa" -> R.drawable.flag_saudi_arabia
        "sb" -> R.drawable.flag_soloman_islands
        "sc" -> R.drawable.flag_seychelles
        "sd" -> R.drawable.flag_sudan
        "se" -> R.drawable.flag_sweden
        "sg" -> R.drawable.flag_singapore
        "sh" -> R.drawable.flag_saint_helena // custom
        "si" -> R.drawable.flag_slovenia
        "sk" -> R.drawable.flag_slovakia
        "sl" -> R.drawable.flag_sierra_leone
        "sm" -> R.drawable.flag_san_marino
        "sn" -> R.drawable.flag_senegal
        "so" -> R.drawable.flag_somalia
        "sr" -> R.drawable.flag_suriname
        "ss" -> R.drawable.flag_south_sudan
        "st" -> R.drawable.flag_sao_tome_and_principe
        "sv" -> R.drawable.flag_el_salvador
        "sx" -> R.drawable.flag_sint_maarten
        "sy" -> R.drawable.flag_syria
        "sz" -> R.drawable.flag_swaziland
        "tc" -> R.drawable.flag_turks_and_caicos_islands
        "td" -> R.drawable.flag_chad
        "tg" -> R.drawable.flag_togo
        "th" -> R.drawable.flag_thailand
        "tj" -> R.drawable.flag_tajikistan
        "tk" -> R.drawable.flag_tokelau // custom
        "tl" -> R.drawable.flag_timor_leste
        "tm" -> R.drawable.flag_turkmenistan
        "tn" -> R.drawable.flag_tunisia
        "to" -> R.drawable.flag_tonga
        "tr" -> R.drawable.flag_turkey
        "tt" -> R.drawable.flag_trinidad_and_tobago
        "tv" -> R.drawable.flag_tuvalu
        "tw" -> R.drawable.flag_taiwan
        "tz" -> R.drawable.flag_tanzania
        "ua" -> R.drawable.flag_ukraine
        "ug" -> R.drawable.flag_uganda
        "us" -> R.drawable.flag_united_states_of_america
        "uy" -> R.drawable.flag_uruguay
        "uz" -> R.drawable.flag_uzbekistan
        "va" -> R.drawable.flag_vatican_city
        "vc" -> R.drawable.flag_saint_vicent_and_the_grenadines
        "ve" -> R.drawable.flag_venezuela
        "vg" -> R.drawable.flag_british_virgin_islands
        "vi" -> R.drawable.flag_us_virgin_islands
        "vn" -> R.drawable.flag_vietnam
        "vu" -> R.drawable.flag_vanuatu
        "wf" -> R.drawable.flag_wallis_and_futuna
        "ws" -> R.drawable.flag_samoa
        "xk" -> R.drawable.flag_kosovo
        "ye" -> R.drawable.flag_yemen
        "yt" -> R.drawable.flag_martinique // no exact flag found
        "za" -> R.drawable.flag_south_africa
        "zm" -> R.drawable.flag_zambia
        "zw" -> R.drawable.flag_zimbabwe
        else -> R.drawable.flag_transparent
    }
}

fun getListOfCountries(): List<CountryCode> {
    val countries: MutableList<CountryCode> = ArrayList()
    countries.add(CountryCode("ad", "+376", "Andorra"))
    countries.add(CountryCode("ae", "+971", "United Arab Emirates (UAE)"))
    countries.add(CountryCode("af", "+93", "Afghanistan"))
    countries.add(CountryCode("ag", "+1", "Antigua and Barbuda"))
    countries.add(CountryCode("ai", "+1", "Anguilla"))
    countries.add(CountryCode("al", "+355", "Albania"))
    countries.add(CountryCode("am", "+374", "Armenia"))
    countries.add(CountryCode("ao", "+244", "Angola"))
    countries.add(CountryCode("aq", "+672", "Antarctica"))
    countries.add(CountryCode("ar", "+54", "Argentina"))
    countries.add(CountryCode("as", "+1", "American Samoa"))
    countries.add(CountryCode("at", "+43", "Austria"))
    countries.add(CountryCode("au", "+61", "Australia"))
    countries.add(CountryCode("aw", "+297", "Aruba"))
    countries.add(CountryCode("ax", "+358", "Åland Islands"))
    countries.add(CountryCode("az", "+994", "Azerbaijan"))
    countries.add(CountryCode("ba", "+387", "Bosnia And Herzegovina"))
    countries.add(CountryCode("bb", "+1", "Barbados"))
    countries.add(CountryCode("bd", "+880", "Bangladesh"))
    countries.add(CountryCode("be", "+32", "Belgium"))
    countries.add(CountryCode("bf", "+226", "Burkina Faso"))
    countries.add(CountryCode("bg", "+359", "Bulgaria"))
    countries.add(CountryCode("bh", "+973", "Bahrain"))
    countries.add(CountryCode("bi", "+257", "Burundi"))
    countries.add(CountryCode("bj", "+229", "Benin"))
    countries.add(CountryCode("bl", "+590", "Saint Barthélemy"))
    countries.add(CountryCode("bm", "+1", "Bermuda"))
    countries.add(CountryCode("bn", "+673", "Brunei Darussalam"))
    countries.add(CountryCode("bo", "+591", "Bolivia, Plurinational State Of"))
    countries.add(CountryCode("br", "+55", "Brazil"))
    countries.add(CountryCode("bs", "+1", "Bahamas"))
    countries.add(CountryCode("bt", "+975", "Bhutan"))
    countries.add(CountryCode("bw", "+267", "Botswana"))
    countries.add(CountryCode("by", "+375", "Belarus"))
    countries.add(CountryCode("bz", "+501", "Belize"))
    countries.add(CountryCode("ca", "+1", "Canada"))
    countries.add(CountryCode("cc", "+61", "Cocos (keeling) Islands"))
    countries.add(CountryCode("cd", "+243", "Congo, The Democratic Republic Of The"))
    countries.add(CountryCode("cf", "+236", "Central African Republic"))
    countries.add(CountryCode("cg", "+242", "Congo"))
    countries.add(CountryCode("ch", "+41", "Switzerland"))
    countries.add(CountryCode("ci", "+225", "Côte D'ivoire"))
    countries.add(CountryCode("ck", "+682", "Cook Islands"))
    countries.add(CountryCode("cl", "+56", "Chile"))
    countries.add(CountryCode("cm", "+237", "Cameroon"))
    countries.add(CountryCode("cn", "+86", "China"))
    countries.add(CountryCode("co", "+57", "Colombia"))
    countries.add(CountryCode("cr", "+506", "Costa Rica"))
    countries.add(CountryCode("cu", "+53", "Cuba"))
    countries.add(CountryCode("cv", "+238", "Cape Verde"))
    countries.add(CountryCode("cw", "+599", "Curaçao"))
    countries.add(CountryCode("cx", "+61", "Christmas Island"))
    countries.add(CountryCode("cy", "+357", "Cyprus"))
    countries.add(CountryCode("cz", "+420", "Czech Republic"))
    countries.add(CountryCode("de", "+49", "Germany"))
    countries.add(CountryCode("dj", "+253", "Djibouti"))
    countries.add(CountryCode("dk", "+45", "Denmark"))
    countries.add(CountryCode("dm", "+1", "Dominica"))
    countries.add(CountryCode("do", "+1", "Dominican Republic"))
    countries.add(CountryCode("dz", "+213", "Algeria"))
    countries.add(CountryCode("ec", "+593", "Ecuador"))
    countries.add(CountryCode("ee", "+372", "Estonia"))
    countries.add(CountryCode("eg", "+20", "Egypt"))
    countries.add(CountryCode("er", "+291", "Eritrea"))
    countries.add(CountryCode("es", "+34", "Spain"))
    countries.add(CountryCode("et", "+251", "Ethiopia"))
    countries.add(CountryCode("fi", "+358", "Finland"))
    countries.add(CountryCode("fj", "+679", "Fiji"))
    countries.add(CountryCode("fk", "+500", "Falkland Islands (malvinas)"))
    countries.add(CountryCode("fm", "+691", "Micronesia, Federated States Of"))
    countries.add(CountryCode("fo", "+298", "Faroe Islands"))
    countries.add(CountryCode("fr", "+33", "France"))
    countries.add(CountryCode("ga", "+241", "Gabon"))
    countries.add(CountryCode("gb", "+44", "United Kingdom"))
    countries.add(CountryCode("gd", "+1", "Grenada"))
    countries.add(CountryCode("ge", "+995", "Georgia"))
    countries.add(CountryCode("gf", "+594", "French Guyana"))
    countries.add(CountryCode("gh", "+233", "Ghana"))
    countries.add(CountryCode("gi", "+350", "Gibraltar"))
    countries.add(CountryCode("gl", "+299", "Greenland"))
    countries.add(CountryCode("gm", "+220", "Gambia"))
    countries.add(CountryCode("gn", "+224", "Guinea"))
    countries.add(CountryCode("gp", "+450", "Guadeloupe"))
    countries.add(CountryCode("gq", "+240", "Equatorial Guinea"))
    countries.add(CountryCode("gr", "+30", "Greece"))
    countries.add(CountryCode("gt", "+502", "Guatemala"))
    countries.add(CountryCode("gu", "+1", "Guam"))
    countries.add(CountryCode("gw", "+245", "Guinea-bissau"))
    countries.add(CountryCode("gy", "+592", "Guyana"))
    countries.add(CountryCode("hk", "+852", "Hong Kong"))
    countries.add(CountryCode("hn", "+504", "Honduras"))
    countries.add(CountryCode("hr", "+385", "Croatia"))
    countries.add(CountryCode("ht", "+509", "Haiti"))
    countries.add(CountryCode("hu", "+36", "Hungary"))
    countries.add(CountryCode("id", "+62", "Indonesia"))
    countries.add(CountryCode("ie", "+353", "Ireland"))
    countries.add(CountryCode("im", "+44", "Isle Of Man"))
    countries.add(CountryCode("is", "+354", "Iceland"))
    countries.add(CountryCode("in", "+91", "India"))
    countries.add(CountryCode("io", "+246", "British Indian Ocean Territory"))
    countries.add(CountryCode("iq", "+964", "Iraq"))
    countries.add(CountryCode("ir", "+98", "Iran, Islamic Republic Of"))
    countries.add(CountryCode("it", "+39", "Italy"))
    countries.add(CountryCode("je", "+44", "Jersey "))
    countries.add(CountryCode("jm", "+1", "Jamaica"))
    countries.add(CountryCode("jo", "+962", "Jordan"))
    countries.add(CountryCode("jp", "+81", "Japan"))
    countries.add(CountryCode("ke", "+254", "Kenya"))
    countries.add(CountryCode("kg", "+996", "Kyrgyzstan"))
    countries.add(CountryCode("kh", "+855", "Cambodia"))
    countries.add(CountryCode("ki", "+686", "Kiribati"))
    countries.add(CountryCode("km", "+269", "Comoros"))
    countries.add(CountryCode("kn", "+1", "Saint Kitts and Nevis"))
    countries.add(CountryCode("kp", "+850", "North Korea"))
    countries.add(CountryCode("kr", "+82", "South Korea"))
    countries.add(CountryCode("kw", "+965", "Kuwait"))
    countries.add(CountryCode("ky", "+1", "Cayman Islands"))
    countries.add(CountryCode("kz", "+7", "Kazakhstan"))
    countries.add(CountryCode("la", "+856", "Lao People's Democratic Republic"))
    countries.add(CountryCode("lb", "+961", "Lebanon"))
    countries.add(CountryCode("lc", "+1", "Saint Lucia"))
    countries.add(CountryCode("li", "+423", "Liechtenstein"))
    countries.add(CountryCode("lk", "+94", "Sri Lanka"))
    countries.add(CountryCode("lr", "+231", "Liberia"))
    countries.add(CountryCode("ls", "+266", "Lesotho"))
    countries.add(CountryCode("lt", "+370", "Lithuania"))
    countries.add(CountryCode("lu", "+352", "Luxembourg"))
    countries.add(CountryCode("lv", "+371", "Latvia"))
    countries.add(CountryCode("ly", "+218", "Libya"))
    countries.add(CountryCode("ma", "+212", "Morocco"))
    countries.add(CountryCode("mc", "+377", "Monaco"))
    countries.add(CountryCode("md", "+373", "Moldova, Republic Of"))
    countries.add(CountryCode("me", "+382", "Montenegro"))
    countries.add(CountryCode("mf", "+590", "Saint Martin"))
    countries.add(CountryCode("mg", "+261", "Madagascar"))
    countries.add(CountryCode("mh", "+692", "Marshall Islands"))
    countries.add(CountryCode("mk", "+389", "Macedonia (FYROM)"))
    countries.add(CountryCode("ml", "+223", "Mali"))
    countries.add(CountryCode("mm", "+95", "Myanmar"))
    countries.add(CountryCode("mn", "+976", "Mongolia"))
    countries.add(CountryCode("mo", "+853", "Macau"))
    countries.add(CountryCode("mp", "+1", "Northern Mariana Islands"))
    countries.add(CountryCode("mq", "+596", "Martinique"))
    countries.add(CountryCode("mr", "+222", "Mauritania"))
    countries.add(CountryCode("ms", "+1", "Montserrat"))
    countries.add(CountryCode("mt", "+356", "Malta"))
    countries.add(CountryCode("mu", "+230", "Mauritius"))
    countries.add(CountryCode("mv", "+960", "Maldives"))
    countries.add(CountryCode("mw", "+265", "Malawi"))
    countries.add(CountryCode("mx", "+52", "Mexico"))
    countries.add(CountryCode("my", "+60", "Malaysia"))
    countries.add(CountryCode("mz", "+258", "Mozambique"))
    countries.add(CountryCode("na", "+264", "Namibia"))
    countries.add(CountryCode("nc", "+687", "New Caledonia"))
    countries.add(CountryCode("ne", "+227", "Niger"))
    countries.add(CountryCode("nf", "+672", "Norfolk Islands"))
    countries.add(CountryCode("ng", "+234", "Nigeria"))
    countries.add(CountryCode("ni", "+505", "Nicaragua"))
    countries.add(CountryCode("nl", "+31", "Netherlands"))
    countries.add(CountryCode("no", "+47", "Norway"))
    countries.add(CountryCode("np", "+977", "Nepal"))
    countries.add(CountryCode("nr", "+674", "Nauru"))
    countries.add(CountryCode("nu", "+683", "Niue"))
    countries.add(CountryCode("nz", "+64", "New Zealand"))
    countries.add(CountryCode("om", "+968", "Oman"))
    countries.add(CountryCode("pa", "+507", "Panama"))
    countries.add(CountryCode("pe", "+51", "Peru"))
    countries.add(CountryCode("pf", "+689", "French Polynesia"))
    countries.add(CountryCode("pg", "+675", "Papua New Guinea"))
    countries.add(CountryCode("ph", "+63", "Philippines"))
    countries.add(CountryCode("pk", "+92", "Pakistan"))
    countries.add(CountryCode("pl", "+48", "Poland"))
    countries.add(CountryCode("pm", "+508", "Saint Pierre And Miquelon"))
    countries.add(CountryCode("pn", "+870", "Pitcairn Islands"))
    countries.add(CountryCode("pr", "+1", "Puerto Rico"))
    countries.add(CountryCode("ps", "+970", "Palestine"))
    countries.add(CountryCode("pt", "+351", "Portugal"))
    countries.add(CountryCode("pw", "+680", "Palau"))
    countries.add(CountryCode("py", "+595", "Paraguay"))
    countries.add(CountryCode("qa", "+974", "Qatar"))
    countries.add(CountryCode("re", "+262", "Réunion"))
    countries.add(CountryCode("ro", "+40", "Romania"))
    countries.add(CountryCode("rs", "+381", "Serbia"))
    countries.add(CountryCode("ru", "+7", "Russian Federation"))
    countries.add(CountryCode("rw", "+250", "Rwanda"))
    countries.add(CountryCode("sa", "+966", "Saudi Arabia"))
    countries.add(CountryCode("sb", "+677", "Solomon Islands"))
    countries.add(CountryCode("sc", "+248", "Seychelles"))
    countries.add(CountryCode("sd", "+249", "Sudan"))
    countries.add(CountryCode("se", "+46", "Sweden"))
    countries.add(CountryCode("sg", "+65", "Singapore"))
    countries.add(CountryCode("sh", "+290", "Saint Helena, Ascension And Tristan Da Cunha"))
    countries.add(CountryCode("si", "+386", "Slovenia"))
    countries.add(CountryCode("sk", "+421", "Slovakia"))
    countries.add(CountryCode("sl", "+232", "Sierra Leone"))
    countries.add(CountryCode("sm", "+378", "San Marino"))
    countries.add(CountryCode("sn", "+221", "Senegal"))
    countries.add(CountryCode("so", "+252", "Somalia"))
    countries.add(CountryCode("sr", "+597", "Suriname"))
    countries.add(CountryCode("ss", "+211", "South Sudan"))
    countries.add(CountryCode("st", "+239", "Sao Tome And Principe"))
    countries.add(CountryCode("sv", "+503", "El Salvador"))
    countries.add(CountryCode("sx", "+1", "Sint Maarten"))
    countries.add(CountryCode("sy", "+963", "Syrian Arab Republic"))
    countries.add(CountryCode("sz", "+268", "Swaziland"))
    countries.add(CountryCode("tc", "+1", "Turks and Caicos Islands"))
    countries.add(CountryCode("td", "+235", "Chad"))
    countries.add(CountryCode("tg", "+228", "Togo"))
    countries.add(CountryCode("th", "+66", "Thailand"))
    countries.add(CountryCode("tj", "+992", "Tajikistan"))
    countries.add(CountryCode("tk", "+690", "Tokelau"))
    countries.add(CountryCode("tl", "+670", "Timor-leste"))
    countries.add(CountryCode("tm", "+993", "Turkmenistan"))
    countries.add(CountryCode("tn", "+216", "Tunisia"))
    countries.add(CountryCode("to", "+676", "Tonga"))
    countries.add(CountryCode("tr", "+90", "Turkey"))
    countries.add(CountryCode("tt", "+1", "Trinidad &amp; Tobago"))
    countries.add(CountryCode("tv", "+688", "Tuvalu"))
    countries.add(CountryCode("tw", "+886", "Taiwan"))
    countries.add(CountryCode("tz", "+255", "Tanzania, United Republic Of"))
    countries.add(CountryCode("ua", "+380", "Ukraine"))
    countries.add(CountryCode("ug", "+256", "Uganda"))
    countries.add(CountryCode("us", "+1", "United States"))
    countries.add(CountryCode("uy", "+598", "Uruguay"))
    countries.add(CountryCode("uz", "+998", "Uzbekistan"))
    countries.add(CountryCode("va", "+379", "Holy See (vatican City State)"))
    countries.add(CountryCode("vc", "+1", "Saint Vincent &amp; The Grenadines"))
    countries.add(CountryCode("ve", "+58", "Venezuela, Bolivarian Republic Of"))
    countries.add(CountryCode("vg", "+1", "British Virgin Islands"))
    countries.add(CountryCode("vi", "+1", "US Virgin Islands"))
    countries.add(CountryCode("vn", "+84", "Vietnam"))
    countries.add(CountryCode("vu", "+678", "Vanuatu"))
    countries.add(CountryCode("wf", "+681", "Wallis And Futuna"))
    countries.add(CountryCode("ws", "4685", "Samoa"))
    countries.add(CountryCode("xk", "+383", "Kosovo"))
    countries.add(CountryCode("ye", "+967", "Yemen"))
    countries.add(CountryCode("yt", "+262", "Mayotte"))
    countries.add(CountryCode("za", "+27", "South Africa"))
    countries.add(CountryCode("zm", "+260", "Zambia"))
    countries.add(CountryCode("zw", "+263", "Zimbabwe"))
    return countries
}