import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:techsta/models/news_model.dart';
import 'package:techsta/services/api_service.dart';
import 'news_details_screen.dart';
import 'saved_news_screen.dart';

class NewsScreen extends StatefulWidget {
  @override
  _NewsScreenState createState() => _NewsScreenState();
}

class _NewsScreenState extends State<NewsScreen> {
  final ApiService apiService = ApiService();
  final FirebaseFirestore firestore = FirebaseFirestore.instance;
  List<NewsModel> newsList = [];

  @override
  void initState() {
    super.initState();
    fetchNews();
  }

  Future<void> fetchNews() async {
    List<NewsModel> fetchedNews = await apiService.fetchNews();
    setState(() {
      newsList = fetchedNews;
    });
  }

  void saveArticle(NewsModel article) async {
    await firestore.collection('saved_articles').add(article.toMap());
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(content: Text('Article Saved!')),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Techsta News')),
      drawer: Drawer(
        child: ListView(
          children: [
            ListTile(
              leading: Icon(Icons.home),
              title: Text("Home"),
              onTap: () {
                Navigator.push(context, MaterialPageRoute(builder: (context) => NewsScreen()));
              },
            ),
            ListTile(
              leading: Icon(Icons.bookmark),
              title: Text("Saved Articles"),
              onTap: () {
                Navigator.push(context, MaterialPageRoute(builder: (context) => SavedNewsScreen()));
              },
            ),
          ],
        ),
      ),
      body: newsList.isEmpty
          ? Center(child: CircularProgressIndicator())
          : ListView.builder(
              itemCount: newsList.length,
              itemBuilder: (context, index) {
                NewsModel article = newsList[index];
                return Card(
                  child: ListTile(
                    leading: article.imageUrl.isNotEmpty
                        ? Image.network(article.imageUrl, width: 100, height: 100, fit: BoxFit.cover)
                        : Icon(Icons.image, size: 50),
                    title: Text(article.title, maxLines: 2, overflow: TextOverflow.ellipsis),
                    subtitle: Text(article.publishedAt),
                    trailing: IconButton(
                      icon: Icon(Icons.bookmark),
                      onPressed: () => saveArticle(article),
                    ),
                    onTap: () {
                      Navigator.push(
                        context,
                        MaterialPageRoute(builder: (context) => NewsDetailsScreen(article: article)),
                      );
                    },
                  ),
                );
              },
            ),
    );
  }
}
