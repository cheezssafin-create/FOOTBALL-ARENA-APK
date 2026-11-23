package com.footballarena.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Bg = Color(0xFF090B10)
private val CardBg = Color(0xFF171B24)
private val Gold = Color(0xFFE3B957)
private val Txt = Color(0xFFF5F2EA)
private val Muted = Color(0xFFB7B5AF)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ArenaApp() }
    }
}
data class Department(val title: String, val subtitle: String, val icon: ImageVector)

@Composable
fun ArenaApp() {
    var tab by remember { mutableStateOf("Home") }
    var page by remember { mutableStateOf<String?>(null) }
    val departments = listOf(
        Department("Tournament Center", "টুর্নামেন্ট তৈরি ও পরিচালনা", Icons.Default.EmojiEvents),
        Department("Live Football", "লাইভ স্কোর ও ম্যাচ তথ্য", Icons.Default.SportsSoccer),
        Department("FOOTBALL ARENA TV", "নিজস্ব ফুটবল চ্যানেল", Icons.Default.LiveTv),
        Department("Player Zone", "খেলোয়াড় প্রোফাইল ও পরিসংখ্যান", Icons.Default.Person),
        Department("Football Market", "জার্সি ও ফুটবল সরঞ্জাম", Icons.Default.ShoppingBag),
        Department("Football Community", "ফ্যান, ক্লাব ও আলোচনা", Icons.Default.Groups),
        Department("Academy & Training", "একাডেমি ও প্রশিক্ষণ", Icons.Default.School),
        Department("Awards & Ranking", "পুরস্কার ও র‍্যাংকিং", Icons.Default.MilitaryTech),
        Department("Entertainment Zone", "ফুটবলভিত্তিক বিনোদন", Icons.Default.Movie),
        Department("Gaming Zone", "নিজস্ব লুডু, ক্যারম ও গেম", Icons.Default.SportsEsports),
        Department("Ground & Team Finder", "মাঠ, দল ও বন্ধুত্বপূর্ণ ম্যাচ", Icons.Default.LocationOn),
        Department("Sponsor & Social Mission", "স্পনসরশিপ ও সামাজিক উদ্যোগ", Icons.Default.VolunteerActivism)
    )
    MaterialTheme(colorScheme = darkColorScheme(primary=Gold, onPrimary=Bg, background=Bg, surface=CardBg, onSurface=Txt)) {
        Scaffold(containerColor=Bg, bottomBar={
            NavigationBar(containerColor=Color(0xFF11141B)) {
                listOf(Triple("Home",Icons.Default.Home,"হোম"),Triple("Matches",Icons.Default.SportsSoccer,"ম্যাচ"),Triple("Discover",Icons.Default.Explore,"আবিষ্কার"),Triple("Profile",Icons.Default.AccountCircle,"প্রোফাইল")).forEach { (key,ic,label) ->
                    NavigationBarItem(selected=tab==key,onClick={tab=key;page=null},icon={Icon(ic,label)},label={Text(label,fontSize=10.sp)},colors=NavigationBarItemDefaults.colors(selectedIconColor=Gold,selectedTextColor=Gold,indicatorColor=Color(0xFF302719),unselectedIconColor=Muted,unselectedTextColor=Muted))
                }
            }
        }) { pad ->
            when {
                page != null -> Column(Modifier.fillMaxSize().padding(pad).padding(20.dp), verticalArrangement=Arrangement.spacedBy(14.dp)) {
                    Row(verticalAlignment=Alignment.CenterVertically) { IconButton(onClick={page=null}) { Icon(Icons.Default.ArrowBack,null,tint=Gold) }; Text(page!!,color=Gold,fontSize=20.sp,fontWeight=FontWeight.Bold) }
                    Text("এই বিভাগের প্রাথমিক স্ক্রিন তৈরি করা হয়েছে।",color=Txt)
                    Text("পরবর্তী পর্যায়ে নিজস্ব ফিচার, ডেটা, অনুমতি ও সার্ভার সংযোগ যুক্ত হবে।",color=Muted)
                    Text("UI starter only — backend is not connected.",color=Muted,fontSize=12.sp)
                }
                tab=="Profile" -> Placeholder("My Profile","প্রোফাইল, টিম ও অ্যাকাউন্ট ব্যবস্থাপনা",Modifier.padding(pad))
                tab=="Matches" -> Placeholder("Matches","যাচাইকৃত লাইভ স্কোর, ফিক্সচার ও ফলাফল পরবর্তী পর্যায়ে যুক্ত হবে।",Modifier.padding(pad))
                tab=="Discover" -> Placeholder("Discover Arena","টুর্নামেন্ট, দল, খেলোয়াড় ও ফুটবল কমিউনিটি খুঁজুন।",Modifier.padding(pad))
                else -> Home(departments,{page=it},Modifier.padding(pad))
            }
        }
    }
}
@Composable
fun Home(departments:List<Department>,open:(String)->Unit,modifier:Modifier=Modifier) {
    Column(modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(horizontal=16.dp),verticalArrangement=Arrangement.spacedBy(15.dp)) {
        Spacer(Modifier.height(8.dp))
        Row(verticalAlignment=Alignment.CenterVertically) {
            Box(Modifier.size(48.dp).background(Gold,RoundedCornerShape(14.dp)),contentAlignment=Alignment.Center) { Text("FA",color=Bg,fontSize=21.sp,fontWeight=FontWeight.Black) }
            Spacer(Modifier.width(10.dp))
            Column(Modifier.weight(1f)) { Text("FOOTBALL ARENA",color=Gold,fontSize=18.sp,fontWeight=FontWeight.ExtraBold); Text("YOUR WORLD OF FOOTBALL",color=Muted,fontSize=9.sp,letterSpacing=1.3.sp) }
            Icon(Icons.Default.NotificationsNone,null,tint=Gold); Spacer(Modifier.width(12.dp)); Icon(Icons.Default.Menu,null,tint=Gold)
        }
        Column(Modifier.fillMaxWidth().background(Color(0xFF1C2029),RoundedCornerShape(22.dp)).padding(20.dp)) {
            Text("WELCOME TO THE ARENA",color=Gold,fontSize=21.sp,fontWeight=FontWeight.Black)
            Spacer(Modifier.height(8.dp))
            Text("ফুটবলের প্রতিটি মুহূর্ত, প্রতিটি স্বপ্ন—একটি প্ল্যাটফর্মে।",color=Txt,fontSize=15.sp)
            Text("Every match. Every player. Every fan.",color=Muted,fontSize=12.sp)
            Spacer(Modifier.height(14.dp))
            Row(horizontalArrangement=Arrangement.spacedBy(8.dp)) { Pill("EXPLORE ARENA",true); Pill("বাংলা | EN",false) }
        }
        Row(verticalAlignment=Alignment.CenterVertically) { Text("EXPLORE DEPARTMENTS",color=Txt,fontSize=15.sp,fontWeight=FontWeight.Bold,modifier=Modifier.weight(1f)); Text("সব বিভাগ",color=Gold,fontSize=12.sp) }
        LazyVerticalGrid(columns=GridCells.Fixed(2),modifier=Modifier.fillMaxWidth().height(690.dp),horizontalArrangement=Arrangement.spacedBy(10.dp),verticalArrangement=Arrangement.spacedBy(10.dp),userScrollEnabled=false) {
            items(departments) { d -> Column(Modifier.fillMaxWidth().height(112.dp).background(CardBg,RoundedCornerShape(16.dp)).clickable{open(d.title)}.padding(13.dp),verticalArrangement=Arrangement.spacedBy(7.dp)) {
                Icon(d.icon,null,tint=Gold,modifier=Modifier.size(25.dp))
                Text(d.title,color=Txt,fontSize=12.sp,fontWeight=FontWeight.Bold,maxLines=1)
                Text(d.subtitle,color=Muted,fontSize=10.sp,maxLines=1)
            } }
        }
        Text("QUICK ACCESS",color=Gold,fontWeight=FontWeight.Bold)
        listOf("Upcoming Matches","Find a Tournament","My Teams","Help & Support").forEach { Row(Modifier.fillMaxWidth().background(CardBg,RoundedCornerShape(12.dp)).clickable{open(it)}.padding(15.dp),verticalAlignment=Alignment.CenterVertically) { Text(it,color=Txt,modifier=Modifier.weight(1f)); Icon(Icons.Default.ChevronRight,null,tint=Gold) } }
        Text("ডেমো সংস্করণ • বাস্তব সার্ভার, লগইন, পেমেন্ট বা লাইভ ম্যাচ এখনো সংযুক্ত নয়।",color=Muted,fontSize=10.sp,textAlign=TextAlign.Center,modifier=Modifier.fillMaxWidth().padding(vertical=10.dp))
    }
}
@Composable fun Placeholder(title:String,desc:String,modifier:Modifier=Modifier) { Column(modifier.fillMaxSize().padding(24.dp),verticalArrangement=Arrangement.spacedBy(12.dp)) { Text(title,color=Gold,fontSize=24.sp,fontWeight=FontWeight.Bold); Text(desc,color=Txt); Text("Demo screen — backend is not connected.",color=Muted,fontSize=12.sp) } }
@Composable fun Pill(text:String,gold:Boolean) { Text(text,color=if(gold)Bg else Gold,fontSize=10.sp,fontWeight=FontWeight.Bold,modifier=Modifier.background(if(gold)Gold else Color(0xFF29251E),RoundedCornerShape(50)).padding(horizontal=13.dp,vertical=9.dp)) }
