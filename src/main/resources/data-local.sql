INSERT INTO algorithm (algorithm_id, name_jp, name_en) VALUES
    (0,     '全探索', 'Full Search'),
    (1,     '貪欲法',               'Greedy Algorithm'),
    (2,     '動的計画法',           'Dynamic Programming'),
    (3,     'プライオリティキュー', 'Priority Queue'),
    (4,     '二分探索木',           'Binary Search Tree'),
    (5,     'Union-Find木',         'Union-Find木'),
    (6,     'ベルマンフォード法',   'Bellman-Ford Algorithm'),
    (7,     'ダイクストラ法',       'Dijkstra''s Algorithm'),
    (8,     'ワーシャルフロイド法', 'Floyd-Warshall Algorithm'),
    (9,     'プリム法',             'Prim''s Algorithm'),
    (10,    'クラスカル法',         'Kruskal''s Algorithm'),
    (11,    'ユークリッドの互除法', 'Euclidean Algorithm');

INSERT INTO contest (contest_id, name) VALUES
    ('arc001', 'AtCoder Regular Contest 001'),
    ('arc002', 'AtCoder Regular Contest 002');

INSERT INTO task (contest_id, task, url) VALUES
    ('arc001', 'A', 'http://arc001.contest.atcoder.jp/tasks/arc001_1'),
    ('arc001', 'B', 'http://arc001.contest.atcoder.jp/tasks/arc001_2'),
    ('arc001', 'C', 'http://arc001.contest.atcoder.jp/tasks/arc001_3'),
    ('arc001', 'D', 'http://arc001.contest.atcoder.jp/tasks/arc001_4'),

    ('arc002', 'A', 'http://arc002.contest.atcoder.jp/tasks/arc002_1'),
    ('arc002', 'B', 'http://arc002.contest.atcoder.jp/tasks/arc002_2'),
    ('arc002', 'C', 'http://arc002.contest.atcoder.jp/tasks/arc002_3'),
    ('arc002', 'D', 'http://arc002.contest.atcoder.jp/tasks/arc002_4');

INSERT INTO label (label_id, contest_id, task, algorithm_id) VALUES
    (0,     'arc002',   'C',    0),
    (1,     'arc002',   'C',    2),
    (2,     'arc002',   'D',    1),
    (3,     'arc001',   'B',    6),
    (4,     'arc001',   'B',    8),
    (5,     'arc001',   'B',    7),
    (6,     'arc001',   'C',    0);
