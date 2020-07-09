package com.arudo.hotellist.models

import com.arudo.hotellist.R

object HotelData {

    val listData:ArrayList<Hotel>get() {
        val list= arrayListOf<Hotel>()
        for (i in names.indices){
            val hotel = Hotel()
            hotel.name= names[i]
            hotel.detail= details[i]
            hotel.photo= images[i]
            hotel.rating = rating[i]
            hotel.website = websites[i]
            hotel.location = locations[i]
            list.add(hotel)
        }
        return list
    }

    private val names = arrayOf(
        "Six Senses Hotels Resorts Spas",
        "Oberoi Hotels & Resorts",
        "Inkaterra Hotels",
        "Tivoli Hotels & Resorts",
        "Montage Hotels & Resorts",
        "Red Carnation Hotel Collection",
        "Anantara Hotels, Resorts & Spas",
        "Sofitel Legend",
        "Raffles Hotels & Resorts",
        "The Leela Palaces, Hotels and Resorts",
        "COMO Hotels & Resorts",
        "The Peninsula Hotels",
        "Auberge Resorts Collection",
        "One&Only Resorts",
        "Aman",
        "Shangri-La Hotels & Resorts",
        "Firmdale Hotels",
        "Rosewood Hotels & Resorts",
        "Hyatt Ziva",
        "Mandarin Oriental",
        "Belmond",
        "Banyan Tree Hotels & Resorts",
        "Rocco Forte Hotels",
        "The Luxury Collection",
        "St. Regis Hotels & Resorts"
    )

    private val details = arrayOf(
        "Set in a row of converted 19th-century shophouses, this upscale hotel is a 5-minute walk from the Buddha Tooth Relic Temple and Museum, and a 10-minute walk from the Chinatown MRT station.\n" +
                "\n" +
                "Stylish, minimalist rooms come with free Wi-Fi, flat-screen TVs and minibars, plus tea and coffeemaking facilities. Plush upgraded rooms have 4-poster beds; individually decorated suites add separate living rooms, and period-style decor and furnishings.\n" +
                "\n" +
                "There's a high-end contemporary restaurant and an elegant, Colonial-style lobby bar. Other amenities include a gym, outdoor yoga, and traditional Chinese medical treatments, as well as cooking classes.",
        "Our story wrote its early chapters in 1934 in Shimla where Mr. M.S. Oberoi pioneered the idea of luxury hospitality in India by opening his first hotel. The lessons self-taught, the inevitable mistakes made, the wisdom gained, the prestigious awards won. All have formed the compass for successive generations of Oberois.\n" +
                "\n" +
                "To this day, we still practice the most simple and uncommon of operational philosophies that began with Mr. M.S. Oberoi himself and now echoed by his son and current chairman Mr. P.R. S. Oberoi: The guest is everything.\n" +
                "Our joy comes from ensuring each is seen and valued as a person, a friend, a family member who has come to stay. It ‘s present in every gesture through words spoken or unspoken, in ways that are obvious and in ways that are quietly respectful of one’s time and privacy.\n" +
                "\n" +
                "You will be hard pressed to find properties as beautiful as ours or restaurants, guest rooms and facilities that are as exceptional. But these are not what give Oberoi Hotels & Resorts its incomparable reputation.\n" +
                "What our guests speak about most is that singular experience of being truly seen, heard and understood. Something no other hotel or resort can emulate. The astonishing effect one feels from an act, a gesture, a word; that is heart felt.",
        "Established in 1975, Inkaterra has been at the forefront of ecotourism and sustainable development in Peru. Inkaterra has spent the past four decades dedicated to authentic travel experiences, aiming to preserve biodiversity and local cultures. Its sustainability efforts have gained them membership with diverse alliances, such as Relais & Châteaux, Virtuoso and National Geographic Unique Lodges of the World.\n" +
                "\n" +
                "Inkaterra properties are established in the heart of the Machu Picchu cloud forest, deep in the Amazonian rainforest, nestled in the cobblestoned streets of Cusco and surrounded by the rolling hills of the Sacred Valley of the Incas. Luxury standards are achieved in all hotels, defined for their eco-friendly design inspired by traditional architecture and built with native materials, in harmony with the environment.",
        "Founded in 1933 in Portugal, Tivoli hotels have always offered a one-of-a-kind experience. We pride ourselves on our luxury hotels and resorts being unique and very different. They have acquired distinct personalities, yet share a timeless, elegant ambience , reflecting the savoir faire of generations of hoteliers.\n" +
                "\n" +
                "Because we believe that travel is about much more than hotels, we urge our clients to Experience More – every single day. Our local Experience Teams help you unlock the secret soul of each destination, offering guests unique curated services and experiences, which make every stay with us extraordinary.\n" +
                "\n" +
                "Whether in cosmopolitan cities, romantic hideaways or idyllic beaches, Tivoli invites you to live like a local, in contemporary or heritage luxury hotels, and welcomes you with passionate and genuine warmth.",
        "Montage Hotels & Resorts is the ultra-luxury hospitality management company founded by Alan J. Fuerstman. Designed to serve the affluent and discerning traveler and homeowner, the company features an artistic collection of distinctive hotels, resorts and residences. Each Montage property offers comfortable elegance, a unique sense of place and spirit, impeccable hospitality and memorable culinary, spa and lifestyle experiences.",
        "President and founder Beatrice Tollman built Red Carnation Hotels with a vision for service excellence and a passion for generous hospitality. Today the collection proudly stands at 20 exceptional properties around the world, each unique and special, whilst sharing the founding values that define our family-owned and run business.\n" +
                "\n" +
                "The hotel collection is lovingly named after the signature flower Mrs Tollman’s husband always wears, and this symbol of hospitality is also worn by every member of the team.\n" +
                "\n" +
                "The guest experience is always at the heart of Red Carnation, where talented teams exceed expectations with warm and caring service, delicious cuisine and thoughtful touches. We also connect guests with the local destination through authentic and meaningful experiences, beautiful and restorative design, and curated art collections. These hotels are truly the art of hospitality.\n" +
                "\n" +
                "This year we celebrate 100 years of hospitality, as one of the 42 family-owned and run TTC travel brands. Red Carnation’s history began when Solomon Tollman opened a small hotel in Paternoster (a small fishing village in South Africa) 100 years ago and we are proud to celebrate this milestone in 2020!",
        "Everyday life is filled with opportunities to seek the exceptional, encounter the new and widen our horizons. For our worldly guests, a stay at Anantara is just one more chapter in a lifetime of travel and exploration. And we intend to make it an extraordinary one.\n" +
                "\n" +
                "The Anantara experience was born in 2001 with our first luxury property in Thailand’s historic seaside retreat of Hua Hin. From that day forward, we expanded throughout the world to cosmopolitan cities, lush islands, desert sands, heritage destinations, uncharted beaches and contemporary resort destinations. Today’s portfolio spans Cambodia, China, Indonesia, Malaysia, Maldives, Mauritius, Mozambique, Oman, Portugal, Qatar, Spain, Sri Lanka, Thailand, Tunisia, United Arab Emirates, Vietnam and Zambia.\n" +
                "\n" +
                "Our thoughtfully designed luxury hotels and resorts provide windows into the genuine modern character of each destination. Inside and outside each property, travellers engage with the places, people and stories that make the destination like nowhere else in the world. Guests curate a lifetime of memories through personal experiences, as Anantara opens doors and enables journeys of adventure and indulgence.",
        "Accor is a world-leading augmented hospitality group offering unique and meaningful experiences in almost 5,000 hotels, resorts, and residences across 110 countries. With an unrivalled portfolio of brands from luxury to economy, Accor has been providing hospitality savoir-faire for more than 50 years.\n" +
                "\n" +
                "Beyond accommodations, Accor enables new ways to live, work, and play with Food&Beverage, nightlife, wellbeing, and coworking brands. ",
        "Raffles has gone out of its way to give you the warmest welcome, the richest experiences and the fondest of memories. And today the legend continues all around the world. From the classic colonial splendour of Raffles Singapore where it all began to Dubai, Seychelles, Cambodia, Paris, Hainan, Makati, Makkah, Warsaw, Maldives and soon to come Bali, Udaipur and many more. The Raffles name is synonymous with luxury, glamour and extraordinary adventure.  Each hotel is an oasis of calm and charm at the crossroads of a civilisation. Each is a carefully chosen destination in its own right. Each is uniquely, indefinably, sublimely Raffles.\n" +
                "\n" +
                "Now, as we grow, and reach new and sometimes surprising destinations, our guests can rest assured that wherever in the world we travel, we will remain distinctly Raffles - infused with the same spirit of adventure, luxury and sublime service. Exciting and enchanting, refreshing and reinvigorating, Raffles is loved by those with an adventurous spirit and a taste for the very best.",
        "The Leela Palaces, Hotels and Resorts, from the very start, has been on a continuous journey to delight every guest offering memorable and magical stays that reflect the essence of India. The signature promise that binds the group’s underlying philosophy is ‘Atithi Devo Bhava’, or ‘Guest is God’, as laid down in the ancient Indian scriptures. And the commitment to stay true to this guiding principle has resulted in outstanding experiences for our guests. Over the years, The Leela has been recognized with numerous prestigious awards and accolades.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Currently, The Leela Palaces, Hotels and Resorts owns and operates five properties and the others are managed. These properties are located in prime urban cities of Bangalore, Chennai, Delhi, Gurgaon, Mumbai and New Delhi as well as India’s magical holiday destinations of Goa and Udaipur. Our forthcoming launches in India will be - The Leela Palace Jaipur, The Leela Palace Agra, The Leela Hotel and Residences Bhartiya City Bengaluru and The Leela Lake Asthamudi Kerala.\n" +
                "\n" +
                " \n" +
                "\n" +
                "The group has an alliance with “Global Hotel Alliance” to offer The Leela DISCOVERY to over 6 million customers and an International Sales & Marketing alliance with the “Preferred Hotels & Resorts” group to help push our products to international global procurement heads in multinational corporations / travel companies. The Leela Palace New Delhi, The Leela Palace Udaipur, The Leela Palace Bengaluru, The Leela Palace Chennai and The Leela Goa are under the “Ultra Travel Collection” brand. The Leela Palace New Delhi & The Leela Palace Udaipur are also “Virtuoso” hotels. ",
        "COMO Hotels and Resorts is committed to creating extraordinary experiences for curious people with a passion for a life lived fully. Our properties, from Bhutan to Miami, draw their inspiration from compelling locations. To this we bring the expertise for nurturing mind-body wellness, as well as world-class cuisine and exacting service. None of our hotels are the same, though our values are consistent – underpinned with a belief in responsible living and the memorable power of meaningful experiences. Above all, COMO provides reassurance in your search for respite from a fast-moving world, so you can feel the joy of living the present moment when the sun sets on your pool in the Turks and Caicos, or on a Buddhist temple in the valleys of Bhutan.",
        "The Peninsula Hotels group has a unique identity among the world’s leading hotels. Established in 1928, we now operate prestigious luxury properties in ten major cities. These include the flagship in Hong Kong, plus Shanghai, Tokyo, Beijing, New York, Chicago, Beverly Hills, Bangkok, Manila, and Paris with Istanbul, London and Yangon under development. Peninsula is a living legend, the name synonymous with luxurious comfort and impeccable service. We set our sights high and our standards higher, aiming always to delight our customers, and in many cases we are now serving the third generation of our loyal guests.",
        "Whether you are traveling with your parents and your children on a weeklong ski trip to Aspen, or looking for a romantic escape in Santorini for just the two of you, it is the simple things that are most important. Revel in time together tasting local, freshly picked tropical fruit in Cabo San Lucas, Mexico, horseback riding through private fincas with a local cowboy in Costa Rica, or planting your own coral garden in the South Pacific. Enjoy fulfilling, luscious shared experiences that connect you to the local culture, its welcoming people, and the beauty of the land, all while doing good and making memories and dreams that will be forever embedded in your soul.",
        "At home in the world’s most inspiring locations, hand-picked for exceptional beauty and unique cultural charm, One&Only Beach Resorts, Nature Resorts, Urban Resorts and Private Homes are havens of outstanding style and service that place you in the heart of every fascinating environment. From incredible, authentic cuisine, to unique tailored excursions, and spectacular spaces to simply ‘be’; unforgettable moments begin at One&Only.",
        "Meticulously designed to frame their natural settings, Aman destinations are renowned for space and privacy. Each welcomes guests as if to the home of a close friend, instilling a sense of peace and belonging amid some of the most diverse natural and historical landscapes.\n" +
                "\n" +
                "It is an approach that has changed little since 1988 when the first retreat was built on Phuket’s west coast. It was named Amanpuri, meaning ‘place of peace’, and Aman was born.\n" +
                "\n" +
                "Today, Aman embraces 32 resorts, hotels, and private residences in 20 countries. Aman continues to seek out transformative experiences and awe-inspiring locations around the world with a further eight coming soon, taking the brand to 40 resorts in 22 countries.",
        "Shangri-La Group grew out of the vision of one man - Robert Kuok - who defined Asian hospitality and set new standards on luxury and what it means to be a host.\n" +
                "\n" +
                "Today our service excellence is legendary within the hospitality industry. We are proud of our Asian heritage and strive to become the best-loved hospitality group bringing people together to live, work, play, eat and rest well.",
        "Firmdale Hotels is owned by Tim and Kit Kemp and comprises 8 hotels in London including Ham Yard, The Soho, Covent Garden, Charlotte Street, Haymarket, Number Sixteen, Knightsbridge and Dorset Square, as well as The Whitby and Crosby Street hotels in New York. Each hotel has an individual style and is situated in a variety of neighbourhoods within close proximity to leading museums, galleries and theatres as well as shops, restaurants, parks and gardens. Creative Director Kit Kemp (left) has been celebrated for the original way she transforms and arranges spaces with a colourful and carefree spirit. Her unique approach to designing and commissioning bespoke fabrics, furniture and artwork ensures that every room is different. The hotels offer a high standard of personal service and provide all the facilities expected of a deluxe hotel. There are restaurants and bars with a casual brasserie-style atmosphere as well as stunning private event spaces, including several state-of-the-art cinemas, a rooftop terrace and bowling alley.",
        "Established in 1979 Rosewood is a distinctive collection of highly individual, luxurious, residential-style hotels inspired by the culture, history and geography of each locale. Led by a team of seasoned industry veterans Rosewood’s acclaimed attention to detail, proactive approach to environmental sustainability and dedication to Relationship Hospitality has earned numerous awards and accolades.",
        "Hyatt was founded by Jay Pritzker in 1957 when he purchased the Hyatt House motel adjacent to the Los Angeles International Airport. Over the following decade, Jay Pritzker and his brother, Donald Pritzker, working together with other Pritzker family business interests, grew the company into a North American management and hotel ownership company, which became a public company in 1962. In 1968, Hyatt International was formed and subsequently became a separate public company. Hyatt Corporation and Hyatt International Corporation were taken private by the Pritzker family business interests in 1979 and 1982, respectively. On December 31, 2004, substantially all of the hospitality assets owned by Pritzker family business interests, including Hyatt Corporation and Hyatt International Corporation, were consolidated under a single entity, now Hyatt Hotels Corporation.",
        "The award winning owner and operator of some of the most luxurious hotels, resorts and residences located in prime destinations around the world.\n" +
                "\n" +
                "Increasingly recognized for creating some of the world’s most sought-after properties, the Group provides 21st century luxury with oriental charm. Above all, Mandarin Oriental is renowned for creating unique hotels through distinctive design and a strong sense of place, luxury hotels right for their time and place.\n" +
                "\n" +
                "The Group regularly receives international recognition and awards for quality management and legendary service hospitality.",
        "It all began in 1976, when we received the keys to the legendary Belmond Hotel Cipriani in Venice. A year later we began collecting the carriages for the Venice Simplon-Orient-Express, which launched in 1982 to whisk intrepid travellers to La Serenissima in style.\n" +
                "\n" +
                "Belmond joined LVMH Moët Hennessy Louis Vuitton in April 2019, reinforcing our place among the international leaders in luxury. For over 40 years we have followed our pioneering spirit and passion for authenticity to create and uncover some of the world’s greatest travel adventures. Today, our collection includes one-of-a-kind hotels, trains, river cruises and safari lodges in stunning destinations across the globe. Each has an incredible story to tell.",
        "In days gone by, the Banyan tree provided shelter to weary travellers. Symbolising the relief and comfort provided by nature, we adopted the name for our special group of hotels that stretch across the globe and offer rest and relaxation to the world-weary. With attentive yet discreet service and associates representing more than 50 nationalities, Banyan Tree Hotels & Resorts provide naturally-luxurious, ecological, culturally-sensitive experiences.\n" +
                "\n" +
                "Banyan Tree Hotels & Resorts has grown into one of the world's leading international operators in the hospitality and spa industry that manages more than 48 resorts and hotels, 64 spas, 74 retail galleries and three championship golf courses in 28 countries.\n" +
                "\n" +
                "The company has created hotels and resorts to suit your needs and lifestyle built on a foundation of sustainability. Find out more about our destinations in English and Simplified Chinese.",
        "Welcome to Rocco Forte Hotels: exquisite hotels in exceptional locations.\n" +
                "\n" +
                "From London to Rome, Sicily to Shanghai, each property is as unique as the place it calls home – each steeped in the spirit of its setting, united by the Forte family’s signature Anglo-Italian style, sophistication and warmth.\n" +
                "\n" +
                "Expect national landmarks at the city’s best addresses and heavenly retreats. Secret gardens, Sicilian-inspired spas, rooftop bars and world-leading restaurants. Imaginative, original design, inspired by each locale, alike in quality and comfort. Genuine, individualised service and an open, easy atmosphere. Expect an unforgettable stay – and expect to return.",
        "A little over a century ago, the era of steamships and trains let explorers travel with ease for the first time. One popular destination was Venice, at the heart of the Mediterranean and a crossroads between East and West.\n" +
                "\n" +
                "The unique appeal of Venice is why, in 1906, the Compagnia Italiana Grandi Alberghi (CIGA) was founded as a hotel brand accommodating travelers to this storied destination. We trace our heritage back to CIGA, which became The Luxury Collection brand in 1994.",
        "Celebrating the modern vanguard, the St. Regis brand is renowned for its rich legacy dating back to 1904. A born inventor and notorious rule-breaker, John Jacob Astor IV founded The St. Regis New York as a place to pursue his passions in the company of the city’s luminaries. More than a century later, St. Regis is renowned for its tradition of innovation and commitment to impeccable service at 45 of the finest addresses around the world."
    )

    private val images = intArrayOf(
        R.drawable.sixsenseshotelsresortsspas,
        R.drawable.oberoihotelsresorts,
        R.drawable.inkaterrahotels,
        R.drawable.tivolihotelsresorts,
        R.drawable.montagehotelsandresorts,
        R.drawable.redcarnationhotelcollection,
        R.drawable.anantarahotelsresortspas,
        R.drawable.sofitellegend,
        R.drawable.raffleshotelsresorts,
        R.drawable.theleelapalaceshotelsandresorts,
        R.drawable.comohotelsresorts,
        R.drawable.thepeninsulahotels,
        R.drawable.aubergeresortscollection,
        R.drawable.oneonlyresorts,
        R.drawable.amanhotel,
        R.drawable.shangrilahotelsandresorts,
        R.drawable.firmdalehotels,
        R.drawable.rosewoodhotelsresorts,
        R.drawable.hyattziva,
        R.drawable.mandarinoriental,
        R.drawable.belmondhotel,
        R.drawable.banyantreehotelsresorts,
        R.drawable.roccofortehotels,
        R.drawable.theluxurycollection,
        R.drawable.stregishotelsresorts
    )

    private val rating = floatArrayOf(
        98.56F,
        95.24F,
        94.84f,
        94.75f,
        94.60f,
        94.11f,
        93.74f,
        93.60f,
        93.47f,
        93.41f,
        93.33f,
        93.32f,
        93.30f,
        93.06f,
        92.75f,
        91.47f,
        91.33f,
        91.16f,
        91.08f,
        90.80f,
        90.69f,
        90.65f,
        90.61f,
        90.33f,
        90.03f
    )

    private val websites = arrayOf(
        "https://www.sixsenses.com",
        "https://www.oberoihotels.com",
        "https://www.inkaterra.com",
        "https://www.tivolihotels.com",
        "https://www.montagehotels.com",
        "https://www.redcarnationhotels.com",
        "https://www.anantara.com",
        "https://sofitel.accorhotels.com",
        "https://www.raffles.com",
        "https://www.theleela.com",
        "https://www.comohotels.com",
        "https://www.peninsula.com",
        "https://www.aubergeresorts.com",
        "https://www.oneandonlyresorts.com",
        "https://www.aman.com",
        "https://www.shangri-la.com",
        "https://www.firmdalehotels.com",
        "https://www.rosewoodhotels.com",
        "https://www.hyatt.com/brands/all-inclusive",
        "https://www.mandarinoriental.com",
        "https://www.belmond.com/hotels",
        "https://www.banyantree.com",
        "https://www.roccofortehotels.com",
        "https://the-luxury-collection.marriott.com",
        "https://st-regis.marriott.com"
    )

    private val locations = arrayOf(
        "https://goo.gl/maps/wueWqe4mbR6Bbc2J8",
        "https://goo.gl/maps/LNBn4ARpdxu96RTeA",
        "https://g.page/InkaterraMachuPicchuPueblo?share",
        "https://goo.gl/maps/7nTtFN5v9M2P3hoR8",
        "https://goo.gl/maps/wK48ihB81wjpY6677",
        "https://goo.gl/maps/REE66pRYCk6GVwp6A",
        "https://goo.gl/maps/PbDxa1ovQ86dcVKy6",
        "https://goo.gl/maps/J4m2vuex3pHR6WP39",
        "https://goo.gl/maps/UQRHNByy1KxRBNkeA",
        "https://goo.gl/maps/fh3vtqJVcKTC2NpbA",
        "https://goo.gl/maps/LT45po2BVrrH5XYS6",
        "https://goo.gl/maps/AXjJdAa7BcoLHuQb9",
        "https://g.page/malliouhana?share",
        "https://goo.gl/maps/4GEvA1ihtsckq9UWA",
        "https://g.page/aman-tokyo?share",
        "https://goo.gl/maps/M8SzrTxNXV3NG2ZJ6",
        "https://goo.gl/maps/oPDyhJu2mXFZcShz8",
        "https://goo.gl/maps/RzfXehHFYD17hkyq8",
        "https://goo.gl/maps/9yVdWG3p8NTL5XGu9",
        "https://goo.gl/maps/6ng8qbL3U9vKVWMA6",
        "https://goo.gl/maps/EsRxfy6EbK7VzdqG6",
        "https://goo.gl/maps/DSxA9QToivaxWxBEA",
        "https://g.page/HotelDeRomeBerlin?share",
        "https://g.page/vedemaresortsantorini?share",
        "https://goo.gl/maps/587ATD7wNzxmn9DG7"
    )
}