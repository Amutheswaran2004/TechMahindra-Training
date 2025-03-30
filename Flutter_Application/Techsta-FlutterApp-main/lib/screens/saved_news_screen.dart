import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:techsta/models/news_model.dart';
import 'news_details_screen.dart';

class SavedNewsScreen extends StatelessWidget {
  final FirebaseFirestore firestore = FirebaseFirestore.instance;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Saved Articles')),
      body: StreamBuilder<QuerySnapshot>(
        stream: firestore.collection('saved_articles').snapshots(),
        builder: (context, snapshot) {
          if (!snapshot.hasData) return Center(child: CircularProgressIndicator());

          List<NewsModel> savedNews = snapshot.data!.docs.map((doc) {
            return NewsModel.fromJson(doc.data() as Map<String, dynamic>);
          }).toList();

          return ListView.builder(
            itemCount: savedNews.length,
            itemBuilder: (context, index) {
              NewsModel article = savedNews[index];
              return ListTile(
                title: Text(article.title),
                subtitle: Text(article.publishedAt),
                onTap: () {
                  Navigator.push(
                    context,
                    MaterialPageRoute(builder: (context) => NewsDetailsScreen(article: article)),
                  );
                },
              );
            },
          );
        },
      ),
    );
  }
}
