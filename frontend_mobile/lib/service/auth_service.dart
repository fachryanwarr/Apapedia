// auth_service.dart
import 'dart:convert';
import 'package:http/http.dart' as http;

Future<String?> loginUser({
  required String username,
  required String password,
}) async {
  final String url = "http://10.0.2.2:8082/api/login-customer"; // Replace with your login API endpoint

  final Map<String, String> data = {
    "username": username,
    "password": password,
  };

  final response = await http.post(
    Uri.parse(url),
    headers: {'Content-Type': 'application/json'},
    body: jsonEncode(data),
  );

  if (response.statusCode == 200) {
    // Login successful, return the JWT token
    final Map<String, dynamic> responseData = jsonDecode(response.body);
    final String jwtToken = responseData['result'];
    return jwtToken;
  } else {
    // Login failed, return null
    print("Login failed: ${response.body}");
    return null;
  }
}
