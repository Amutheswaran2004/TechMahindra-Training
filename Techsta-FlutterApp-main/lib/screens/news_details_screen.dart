import 'package:flutter/material.dart';
import 'package:techsta/models/news_model.dart';
import 'package:url_launcher/url_launcher.dart';
import 'package:share_plus/share_plus.dart';

class NewsDetailsScreen extends StatelessWidget {
  final NewsModel article;

  NewsDetailsScreen({required this.article});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('News Details')),
      body: Padding(
        padding: const EdgeInsets.all(8.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            article.imageUrl.isNotEmpty
                ? Image.network(article.imageUrl, width: double.infinity, fit: BoxFit.cover)
                : Icon(Icons.image, size: 100),
            SizedBox(height: 10),
            Text(article.title, style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold)),
            SizedBox(height: 10),
            Text(article.description),
            Spacer(),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                ElevatedButton.icon(
                  icon: Icon(Icons.link),
                  label: Text("Read More"),
                  onPressed: () => launch(article.url),
                ),
                ElevatedButton.icon(
                  icon: Icon(Icons.share),
                  label: Text("Share"),
                  onPressed: () => Share.share(article.url),
                ),
              ],
            )
          ],
        ),
      ),
    );
  }
}
