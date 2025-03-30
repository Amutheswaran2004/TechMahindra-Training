import 'package:cloud_firestore/cloud_firestore.dart';
import '../models/news_model.dart';

class FirestoreService {
  final CollectionReference bookmarksCollection =
      FirebaseFirestore.instance.collection('bookmarks');

  // Save a bookmarked article
  Future<void> saveBookmark(NewsModel news) async {
await bookmarksCollection.doc(news.title).set(news.toMap());
  }

  // Remove a bookmark
  Future<void> removeBookmark(String title) async {
    await bookmarksCollection.doc(title).delete();
  }

  // Get all bookmarks
  Stream<List<NewsModel>> getBookmarks() {
    return bookmarksCollection.snapshots().map((snapshot) {
      return snapshot.docs.map((doc) {
        return NewsModel.fromJson(doc.data() as Map<String, dynamic>);
      }).toList();
    });
  }
}
