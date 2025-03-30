import 'dart:convert';
import 'package:http/http.dart' as http;
import 'package:techsta/models/news_model.dart';
import 'package:techsta/utils/constants.dart';

class ApiService {
  Future<List<NewsModel>> fetchNews() async {
    final url = Uri.parse(
        'https://newsapi.org/v2/top-headlines?category=technology&apiKey=$apiKey');
    final response = await http.get(url);

    if (response.statusCode == 200) {
      final data = jsonDecode(response.body);
      final List articles = data['articles'];
      return articles.map((e) => NewsModel.fromJson(e)).toList();
    } else {
      throw Exception('Failed to fetch news');
    }
  }
}
