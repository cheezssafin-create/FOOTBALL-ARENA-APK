# FOOTBALL ARENA — Master Plan + Android Starter

## প্রকল্পের পরিচয়
- নাম: FOOTBALL ARENA
- প্রথম প্ল্যাটফর্ম: Android; পরে Website
- ডিজাইন: আগের Black & Gold Premium Design
- ভাষা: বাংলা + English
- মালিকানা লক্ষ্য: source code, domain, hosting, database, admin access ও backup-এর নিয়ন্ত্রণ মালিকের হাতে।

এই ZIP-এ Kotlin + Jetpack Compose Android UI starter আছে। এটি সম্পূর্ণ বাণিজ্যিক অ্যাপ নয়। Backend, login, payment, live score, video streaming, multiplayer server ও production security এখনো যুক্ত হয়নি।

## মূল নীতি
- দর্শকদের public tournament, fixture, result, score ও সাধারণ public information বিনামূল্যে।
- একই account-এ একাধিক অনুমোদিত role থাকতে পারে।
- Committee শুধু নিজের tournament; seller শুধু নিজের shop/order; channel owner শুধু নিজের channel পরিচালনা করবে।
- Platform owner-এর আলাদা Admin Dashboard, role-based permissions ও audit log থাকবে।
- কোনো automatic debit নয়; channel renewal ব্যবহারকারী নিজে করবেন।
- Payment, fee, refund, privacy ও rules স্বচ্ছভাবে দেখাতে হবে।
- শিশু সুরক্ষা, copyright, content moderation, report/block, complaint ও appeal ব্যবস্থা আবশ্যক।
- বাংলাদেশে launch-এর আগে প্রযোজ্য আইন ও সরকারি নিয়ম আইনজীবী/সরকারি কর্তৃপক্ষের মাধ্যমে যাচাই করতে হবে।

## প্রধান বিভাগ
1. Tournament Center
2. Live Football Center
3. Player Zone
4. Football Market
5. Football Community
6. Academy & Training Center
7. Awards & Recognition
8. Sponsor Center
9. Football Social Mission / Charity
10. Admin & Management Center
11. Entertainment Zone
12. Gaming Zone
13. FOOTBALL ARENA TV / Channel
14. Tickets & Events
15. Ground Finder & Booking
16. Team Finder & Friendly Match
17. Referee Booking & Coach Directory
18. Football Photography
19. Football Job Board
20. Women's Football League
21. Volunteer Network
22. Football Calendar
23. Football History Museum
24. Player Portfolio & Talent Scouting
25. Tournament Protest & Dispute Resolution
26. Sponsor a Team / Young Player
27. Public Transparency Report

## Tournament Center
- Public tournament list; name/area search; location, format, date, entry fee ও registration status filters।
- Detail page: organizer, rules, format, capacity, fee, venue, dates, awards, sponsor, teams, fixtures ও results।
- Team application: team details, manager, captain, roster, jersey number, substitutes, rule acceptance, payment evidence।
- Status: Submitted / Under Review / Approved / Rejected / Needs Changes।
- Committee payment manually verify করবে; transaction ID একা payment proof নয়।
- Committee dashboard: application, roster review, approval, notice, fixture, result, referee, award।
- Match Day Player List; replacement হলে committee approval ও audit history রাখতে হবে।
- Formats: League, Knockout, Group + Knockout; flexible team counts।
- Match data: date, time, venue, officials, score, scorer, cards, substitutions, table, next round।
- Walkover/no-show কেবল authorized official/committee confirm করবে; সময় পার হলেই automatic winner নয়।
- Configurable yellow/red card, suspension, VIP guest/match banner, awards, announcements, notices, public event।
- Reminder via push/email; optional SMS may cost money.
- Live score event log: kickoff, goal, scorer, minute, card, substitution, halftime, extra time, penalty, fulltime।
- Chat, protest, report, dispute resolution, poster sharing ও tournament history।

## Live Football & Video
Fixtures, verified scores, match results, tables, player stats। Authorized official score event দেবে। In-app video streaming future phase; streaming provider, bandwidth, storage, rights/consent, moderation ও takedown process লাগবে।

## Entertainment Zone — spectator-এর জন্য free পরিকল্পনা
Funny Moments, Skill Challenge, Quiz Battle, Fan Commentary, Fan of the Week, Football Cartoon, no-betting Score Prediction, Goal Celebration, Fan Songs, no-betting Fantasy Football, mini games, Talk Show, Stadium Atmosphere, Player Face-off, Memories, Jersey Design Contest, Penalty Master, Best Goal Voting, Meme Zone, Family Football, Avatar Studio, Virtual Stadium Tour, Bingo, Guess the Player, Guess the Commentary, Puzzle, Daily Challenge, Fan Wall, Football Festival, Arena Entertainment Awards।
ARENA FUN POINTS হবে non-cash; cash conversion/trading বা betting নয়। Family-friendly moderation, report/block ও copyright compliance আবশ্যক।

## Gaming Zone — নিজস্ব/আইনসম্মতভাবে নিয়ন্ত্রিত গেম
- ARENA LUDO (2–4 player, private room, AI)
- ARENA CARROM (single/doubles)
- ARENA BRAIN (chess, snakes & ladders, puzzle/memory)
- ARENA FOOTBALL (penalty, free kick, goalkeeper)
- ARENA RACING (নিজস্ব ছোট racing game)
- ARENA BATTLE (পরবর্তী বড় প্রকল্প)
- ARENA MINI GAMES
- Matchmaking, private room, friends, ranking ও moderation।
প্রথমে Ludo, Carrom ও Football mini-game; বড় battle royale আলাদা ব্যয়বহুল প্রকল্প। কোনো betting/gambling বা cash-convertible point নয়। External game app/link অন্তর্ভুক্ত নয়।

## Marketplace & Seller
Jersey ও football equipment store; seller profile, product, size, customization, stock, order, review, complaint। Seller শুধু নিজের shop/order দেখবে। Counterfeit check, refund/return, delivery tracking, seller verification। Checkout/payment-এর জন্য approved integration দরকার।

## Ticketing
General/VIP/final/opening/awards/free ticket; QR ticket, quantity, sale window, scanner validation, duplicate prevention, cancellation/refund rules ও report।

## Community & services
People's Football Ranking, Rising Star, Village to National Champion, Fan Club, Goal of Week, Quiz, Digital Football ID, Hall of Fame, Fan Reactions, Local News, Best Supporter, Football Challenge, Sponsor & Reward, Charity, Academy; Ground Finder, Team/Friendly Match Finder, Referee/Coach directory, Podcast, Photography, Job Board, Women's League, Volunteer, Calendar, History Museum, Talent Scouting, Protest/Dispute, Sponsor a Team/Young Player, insurance information, Transparency Report।
Insurance section informational only unless properly authorized.

## Roles & access
Spectator, player, manager, captain, organizer, committee, referee, coach, channel owner/subscriber, seller, sponsor, volunteer, platform admin। Server-side role-based access; organizer sees own tournament, seller own store/orders, channel owner own channel। Admin access audited.

## Latest subscription decisions
- Spectator: ordinary public features, Entertainment ও Gaming Zone free.
- Organizer/Committee: ৳199 weekly, ৳499 monthly, ৳1,999 yearly.
- Channel: ৳299 monthly; first-time 24-hour trial discussed; after trial/month user manually pays/renews; no automatic card charge.
- Jersey Seller: ৳499 monthly.
These are proposed product prices, not a claim that hosting/streaming/payment services cost nothing. Fees, tax, refund and gateway terms must be disclosed.

## Admin Dashboard
User/role management; organizer/seller/channel review; reports/complaints/appeals; tournament monitoring; security; permission; audit logs; backup/restore tests; app notices/version; transparency report। Sensitive business data access permission-controlled and logged.

## Security & compliance checklist
Secure auth, admin MFA, server-side authorization, encrypted transit, secret protection, data minimization, privacy notice, consent, account deletion, child safety, moderation, payment gateway merchant approval, never store raw card data, copyright/broadcast rights, venue/participant consent, Bangladesh legal/tax verification, regular backup and restore tests.

## Development roadmap
0. Scope, roles, workflows, pricing, privacy/legal review.
1. Android UI starter: theme, home, navigation, department placeholders — this ZIP.
2. Accounts, profiles, roles, permissions.
3. Tournament MVP: create, registration, approval, fixtures, score, result.
4. Admin, audit, reports, complaint, backup.
5. Marketplace and manual subscriptions.
6. Community and entertainment moderation.
7. Original games and multiplayer server.
8. Channel and live streaming infrastructure.
9. Website, testing, legal verification, Play Store release.

## Open this project
1. ZIP extract করুন।
2. Computer-এ Android Studio খুলুন।
3. Open → extracted `FOOTBALL_ARENA_Starter` folder।
4. Gradle sync; প্রয়োজনে JDK 17।
5. Emulator বা USB debugging-সহ Android device-এ Run।
6. এই starter-এ Gradle Wrapper অন্তর্ভুক্ত নেই। Android Studio Gradle setup চাইলে prompt/error-এর screenshot পাঠাবেন; অনুমান করে version পরিবর্তন করবেন না।

## বর্তমান কোডে যা আছে / নেই
আছে: Kotlin Android entry point, Compose dark/gold theme, home screen, department cards, bottom navigation, placeholder screens।
নেই: backend, database, login, live score, payment, chat, streaming, multiplayer, push notification, admin logic, production security, release signing।
